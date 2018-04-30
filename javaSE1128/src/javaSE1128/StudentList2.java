package javaSE1128;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList2 {

	List<Student2> list = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	public void startup() {
		System.out.println("欢迎来到学生管理系统");
		System.out.println("1.录入学员信息");
		System.out.println("2.根据学号查询学员信息");
		System.out.println("3.修改学员信息");
		System.out.println("4.根据学号删除学员信息");
		System.out.println("5.统计学员平均考试成绩");
		System.out.println("6.退出系统");
		System.out.println("请输入选项");
		
		String num = input.next();
		if(num.equals("1")) {
			save();
			
		} else if(num.equals("2")) {
			find();
			
		} else if(num.equals("3")) {
			modify();
		
		} else if(num.equals("4")) {
			remove();
			
			
		} else if(num.equals("5")) {
			statistic();
			
			
		} else if(num.equals("6")) {
			System.exit(0);
		} else {
			System.out.println("选项输入错误，请重新输入");
		}
		startup();
	}
	private void statistic() {
		// TODO Auto-generated method stub
		int total = 0;
		for(Student2 student2 : list) {
			total = total + student2.getScore();
		}
		if(list.size()==0) {
			System.out.println("平均成绩为：0");
		} else {
			double average = (double)total/list.size();
			System.out.println("平均成绩为："+average);
		}
	}
	private void remove() {
		// TODO Auto-generated method stub
		System.out.println("请输入学号");
		String code = input.next();
		if(findbycode(code)==null) {
			System.out.println("查无此人");
		} else {
			Student2 student2 = findbycode(code);
			list.remove(student2);
			System.out.println("删除成功");
		}
	
	}
	private void modify() {
		// TODO Auto-generated method stub
		System.out.println("请输入学号");
		String code = input.next();
		if(findbycode(code)==null) {
			System.out.println("查无此人");
		} else {
			Student2 student2 = findbycode(code);
			System.out.println(student2);
			boolean flag = false;
			System.out.println("是否要修改姓名(Y|N)?");
			String choice = input.next();
			if(choice.equalsIgnoreCase("y")){
				System.out.println("请输入新姓名");
				String name = input.next();
				student2.setName(name);
				flag = true;
			} 
			
			System.out.println("是否要修改年龄(Y|N)?");
			choice = input.next();
			if(choice.equalsIgnoreCase("y")){
				System.out.println("请输入新年龄");
				int age = input.nextInt();
				student2.setAge(age);
				flag = true;
			} 
			
			System.out.println("是否要修改成绩(Y|N)?");
			choice = input.next();
			if(choice.equalsIgnoreCase("y")){
				System.out.println("请输入新成绩");
				int score = input.nextInt();
				student2.setScore(score);
				flag = true;
			} 
			if(flag) {
				System.out.println("修改成功");
			}
		}
	}
	private void find() {
		// TODO Auto-generated method stub
		System.out.println("请输入学号");
		String code = input.next();
		if(findbycode(code)==null) {
			System.out.println("查无此人");
		} else {
			Student2 student2 = findbycode(code);
			System.out.println(student2);
		}
	}
	private void save() {
		// TODO Auto-generated method stub
		System.out.println("请输入学号");
		String code = input.next();
		if(findbycode(code)==null) {
			System.out.println("请输入姓名");
			String name = input.next();
			System.out.println("请输入年龄");
			int age = input.nextInt();
			System.out.println("请输入成绩");
			int score = input.nextInt();
			Student2 student2 = new Student2(code, name, age, score);
			list.add(student2);
			System.out.println("录入成功");
		} else {
			System.out.println("学号已存在");
		}
	}
	private Student2 findbycode(String code) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(code)) {
				return list.get(i);
			}
		}
		return null;
	}
}
