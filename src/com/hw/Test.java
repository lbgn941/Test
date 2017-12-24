/**package关键字指定此类所在的路径（文件夹）为src下的com/hw/下
 * 
 */
package com.hw;//必须为第一行
//引入需要的List类型
import java.util.ArrayList;
import java.util.List;

/**
 * 声明一个java类名字叫Test，
 * public表示这个类是公共的不是私有private的或保护的protected
 * class关键字表示这是一个类
 * @author idea
 *
 */
public class Test {
	//属性
	private String name;

	/**java程序入口main函数，必须声明为下面格式
	 * @param args 参数名可以改
	 */
	public static void main(String[] args) {
		//创建一个Test类型的对象 new为关键字表示新建
		Test test  =  new Test();
		//调用test对象的test方法
		System.out.println(test.test("小样"));
		
		//创建一个list对象
		List<String> list = new ArrayList<String>();
		//添加一个字符串到list
		list.add("呵呵");
		//输出list
		System.out.println(list);
	}
	
	/**
	 * 声明一个保护的protected的函数 ,返回String类型对象
	 * @param str 参数
	 * @return
	 */
	protected String test(String str){
		return str + "行不行!";
	}

	/**
	 *  name
	 * @CreateDate: [2017年4月24日 上午10:03:58] 
	 * @Description: [功能]获取 name
	 * @Author: [liguosheng]
	 * @UpdateDate: [2017年4月24日上午10:03:58]
	 * @UpdateRemark: [说明本次修改内容]
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * @CreateDate: [2017年4月24日 上午10:03:58] 
	 * @Description: [功能]设置 name
	 * @Author: [liguosheng]
	 * @UpdateDate: [2017年4月24日上午10:03:58]
	 * @UpdateRemark: [说明本次修改内容]
	 */
	public void setName(String name) {
		this.name = name;
	}

}
