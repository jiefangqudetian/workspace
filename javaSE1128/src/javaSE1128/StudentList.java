package javaSE1128;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {

	Scanner input = new Scanner(System.in);
	List<Student> list = new ArrayList<>();
	Student student = new Student();
	public void startup() {
		System.out.println("1.录入");
		System.out.println("2.查询");
		System.out.println("3.修改");
		System.out.println("4.删除");
		System.out.println("5.统计");
		System.out.println("请输入选项");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("请输入姓名");
			String name = input.next();
			if(findbyname(name)!=null) {
				System.out.println("学生信息已存在");
			} else {
				System.out.println("请输入学号");
				String number = input.next();
				System.out.println("请输入年龄");
				String age = input.next();
				System.out.println("请输入成绩");
				int scores = input.nextInt();
				Student stu = new Student();
				stu.setName(name);
				stu.setXuehao(number);
				stu.setAge(age);
				stu.setScores(scores);
				list.add(stu);
				System.out.println("录入成功");
			}
			break;
		case 2:
			System.out.println("请输入姓名");
			String namec = input.next();
			if(findbyname(namec)!=null) {
				Student stuc = findbyname(namec);
				System.out.println("学号："+stuc.getXuehao());
				System.out.println("姓名："+stuc.getName());
				System.out.println("年龄："+stuc.getAge());
				System.out.println("成绩："+stuc.getScores());
			} else {
				System.out.println("查无此人");
			}
			
			break;
		case 3:
			System.out.println("请输入学生姓名");
			String namex = input.next();
			if(findbyname(namex)!=null) {
				Student stux = findbyname(namex);
				System.out.println("学号："+stux.getXuehao());
				System.out.println("姓名："+stux.getName());
				System.out.println("年龄："+stux.getAge());
				System.out.println("成绩："+stux.getScores());
				System.out.println("请输入新学号");
				String numberx = input.next();
				System.out.println("请输入新年龄");
				String agex = input.next();
				System.out.println("请输入新成绩");
				int scoresx = input.nextInt();
				stux.setXuehao(numberx);
				stux.setAge(agex);
				stux.setScores(scoresx);
				System.out.println("修改成功");
			} else {
				System.out.println("查无此人");
			}
			
			break;
		case 4:
			System.out.println("请输入姓名");
			String names = input.next();
			if(findindex(names)==0) {
				System.out.println("查无此人");
			} else {
				list.remove(findbyname(names));
				System.out.println("删除成功");
			}
			break;
		case 5:
			int totalnum = 0;
			for(Student stut : list) {
				totalnum = totalnum + stut.getScores();
			}
			int averagescore = totalnum/list.size();
			System.out.println("平均成绩为" + averagescore);
			break;

		default:
			break;
		}
		startup();
	}
	private int findindex(String name) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				return i;
			}
		}
		return 0;
	}
	private Student findbyname(String name) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				return list.get(i);
			}
		}
		
		return null;
	}
}
