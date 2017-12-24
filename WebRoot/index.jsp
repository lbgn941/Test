<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" 
           uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
<%//jsp脚本
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("key","value");
out.print(request.getAttribute("key"));
out.print("<br>");
%>
<%!//声明一个函数
public String test(){
	 return "呵呵";
} %>
<%=test()%><br>
<c:if test="${ !empty key }" var="test">输出</c:if>
${test }<br>
<c:out value="<%=test() %>"/><br>
<c:set value="ddd1" var ="yy"/>
${yy }<br>222222
<c:set value="5555" var ="yy"/>
${yy }<br>222222
<c:out value="${key}" >343</c:out><br/>
<c:out value="yy" />
<c:catch var="exception">
<%=1/0 %>
</c:catch>
${exception }
<c:set var="now" value="<%=new java.util.Date() %>"/>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd"/>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
    <%String atts[] = {"hello","this","is","a","gril"};
  request.setAttribute("atts",atts);
  
   %>
   <c:forEach items="${atts }" var="item" varStatus="s">
   <h2><c:out value="${item }"/>的四种属性</h2>
   index:${s.index }<br/>
   count:${s.count }<br/>
   first:${s.first }<br/>
   last：${s.last }<br/>
   </c:forEach>
    This is my JSP page. <br>
    request 范围内查找key:${requestScope.key }
    <br>
    key是否为空:${empty key ? "为空" : "不为空" }
    <br>
    key:${key =='value' ? "等于" : "不等于" }value
    <br>
    keys:${not empty keys ? "不等于" : "等于" }空
    <br>
    keys:${empty keys ? "等于" : "不等于" }空
    <br>
    keys:${(keys==null or keys=='') ? "等于" : "不等于" }空
    <br>
    keys:${(keys eq null or keys eq'') ? "等于" : "不等于" }空
    <br>not eq这么写
    keys:${!(keys eq null or keys eq '') ? "不等于" : "等于" }空
    <br>
    param keys:${!(param.keys == null) ? "不等于" : "等于" }空
    <br>
    ${param }
    keys:${!(empty param.keys) ? "不等于" : "等于" }空
    <br>
    <c:remove var="key" scope="session"/>
    key${key }
  </body>
</html>
