package com.kaishengit.test;

import com.kaishengit.entity.ChildStudent;
import com.kaishengit.entity.Dog;
import com.kaishengit.entity.Student;

import javaSE1123.com.kaishengit.stri.StringUtil;

/**
 * @author LENOVO
 *
 */
/**
 * @author LENOVO
 *
 */
public class Test { 
	/**
	 * 
	 */
	String name;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Student.sayHello();
//		stu.sayHi();
//		
//		float r = (float)1.1;
//		stu.say();
//		Student stu = new Student();
//		System.out.println(stu);
//		System.out.println(Integer.MAX_VALUE);
//		
//		Integer in = new Integer(10);
//		System.out.println(in);
//		Integer in2 = new Integer("8");
//		System.out.println(in2);
		
		//数字直接转换字符串
//		int a = Integer.parseInt("137828");
//		System.out.println(a);
		//字符串直接转换数字
//		String b = Integer.toString(137828);
//		System.out.println(b);
		
//		//数字转换为Integer
//		Integer in = 5;
//		in = new Integer(4);
//		in = Integer.valueOf(4);
//		//字符串转换为Integer
//		Integer in1 = new Integer("4");
//		in1 = Integer.valueOf("3");
//		
//		//Integer转换为int
//		int c = in.intValue();
//		c = in;
//		
//		//Integer转换为String
//		String d = in.toString();
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		/*Student[] students = new Student[10];
		System.out.println(students[0]);
		ChildStudent childStudent = new ChildStudent(); 
		System.out.println(childStudent instanceof Student);
		*/
//		int nam = 10;
//		Dog dog = new Dog();
//		nam = dog.gaiming(nam);
//		System.out.println(nam);
//		int q = 1000;
//		int r = 1000;
//		System.out.println(q == r);
//		int i = '0';
//		int q = '9';
//		System.out.println(i);
//		System.out.println(q);
		
//		System.out.println(StringUtil.check("777"));
//		System.out.println(StringUtil.checkkk("1.@.sdcom"));
//		StringUtil.cut("410823199111070251");
		
		String string = "410823199111070251";
		System.out.println(string);
		StringUtil.cut1("410823199111070251");
		
		String string2  = "abcgd";
		
		System.out.println();
		StringUtil.cut1("410823199111070251");
		
		
		String str1 = new String();
		String[] str2 = new String[10];
		String str3 = "abc";
		System.out.println(StringUtil.isEmpty(str3));
	}
	
	/**
	 * 
	 */
	public void abc() {
//		String num;
		System.out.println(name);
	}
}
