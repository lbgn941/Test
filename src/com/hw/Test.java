/**package�ؼ���ָ���������ڵ�·�����ļ��У�Ϊsrc�µ�com/hw/��
 * 
 */
package com.hw;//����Ϊ��һ��
//������Ҫ��List����
import java.util.ArrayList;
import java.util.List;

/**
 * ����һ��java�����ֽ�Test��
 * public��ʾ������ǹ����Ĳ���˽��private�Ļ򱣻���protected
 * class�ؼ��ֱ�ʾ����һ����
 * @author idea
 *
 */
public class Test {
	//����
	private String name;

	/**java�������main��������������Ϊ�����ʽ
	 * @param args ���������Ը�
	 */
	public static void main(String[] args) {
		//����һ��Test���͵Ķ��� newΪ�ؼ��ֱ�ʾ�½�
		Test test  =  new Test();
		//����test�����test����
		System.out.println(test.test("С��"));
		
		//����һ��list����
		List<String> list = new ArrayList<String>();
		//���һ���ַ�����list
		list.add("�Ǻ�");
		//���list
		System.out.println(list);
	}
	
	/**
	 * ����һ��������protected�ĺ��� ,����String���Ͷ���
	 * @param str ����
	 * @return
	 */
	protected String test(String str){
		return str + "�в���!";
	}

	/**
	 *  name
	 * @CreateDate: [2017��4��24�� ����10:03:58] 
	 * @Description: [����]��ȡ name
	 * @Author: [liguosheng]
	 * @UpdateDate: [2017��4��24������10:03:58]
	 * @UpdateRemark: [˵�������޸�����]
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * @CreateDate: [2017��4��24�� ����10:03:58] 
	 * @Description: [����]���� name
	 * @Author: [liguosheng]
	 * @UpdateDate: [2017��4��24������10:03:58]
	 * @UpdateRemark: [˵�������޸�����]
	 */
	public void setName(String name) {
		this.name = name;
	}

}
