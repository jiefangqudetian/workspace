package com.kaishengit.test;

import java.util.Random;
import java.util.Scanner;

import com.kaishengit.animal.Cat;
//import com.kaishengit.animal.Cat;
import com.kaishengit.entity.Student;

public class Test {

	public static void main(String[] args) { 
	Scanner scanner = new Scanner(System.in);
	Random randon = new Random();
	Student student = new Student();
	String name = student.getName();
	System.out.println(); //System类不能被实例化是因为System类的构造方法被private修饰，out方法被static修饰
	
//	System system = new System();
	
	com.kaishengit.animal.Cat cat = new com.kaishengit.animal.Cat();
	
	}
	
	String math = new String();
	Student stu = new Student();
	
}
