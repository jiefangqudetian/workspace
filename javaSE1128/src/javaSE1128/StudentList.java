package javaSE1128;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {

	Scanner input = new Scanner(System.in);
	List<Student> list = new ArrayList<>();
	Student student = new Student();
	public void startup() {
		System.out.println("1.¼��");
		System.out.println("2.��ѯ");
		System.out.println("3.�޸�");
		System.out.println("4.ɾ��");
		System.out.println("5.ͳ��");
		System.out.println("������ѡ��");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("����������");
			String name = input.next();
			if(findbyname(name)!=null) {
				System.out.println("ѧ����Ϣ�Ѵ���");
			} else {
				System.out.println("������ѧ��");
				String number = input.next();
				System.out.println("����������");
				String age = input.next();
				System.out.println("������ɼ�");
				int scores = input.nextInt();
				Student stu = new Student();
				stu.setName(name);
				stu.setXuehao(number);
				stu.setAge(age);
				stu.setScores(scores);
				list.add(stu);
				System.out.println("¼��ɹ�");
			}
			break;
		case 2:
			System.out.println("����������");
			String namec = input.next();
			if(findbyname(namec)!=null) {
				Student stuc = findbyname(namec);
				System.out.println("ѧ�ţ�"+stuc.getXuehao());
				System.out.println("������"+stuc.getName());
				System.out.println("���䣺"+stuc.getAge());
				System.out.println("�ɼ���"+stuc.getScores());
			} else {
				System.out.println("���޴���");
			}
			
			break;
		case 3:
			System.out.println("������ѧ������");
			String namex = input.next();
			if(findbyname(namex)!=null) {
				Student stux = findbyname(namex);
				System.out.println("ѧ�ţ�"+stux.getXuehao());
				System.out.println("������"+stux.getName());
				System.out.println("���䣺"+stux.getAge());
				System.out.println("�ɼ���"+stux.getScores());
				System.out.println("��������ѧ��");
				String numberx = input.next();
				System.out.println("������������");
				String agex = input.next();
				System.out.println("�������³ɼ�");
				int scoresx = input.nextInt();
				stux.setXuehao(numberx);
				stux.setAge(agex);
				stux.setScores(scoresx);
				System.out.println("�޸ĳɹ�");
			} else {
				System.out.println("���޴���");
			}
			
			break;
		case 4:
			System.out.println("����������");
			String names = input.next();
			if(findindex(names)==0) {
				System.out.println("���޴���");
			} else {
				list.remove(findbyname(names));
				System.out.println("ɾ���ɹ�");
			}
			break;
		case 5:
			int totalnum = 0;
			for(Student stut : list) {
				totalnum = totalnum + stut.getScores();
			}
			int averagescore = totalnum/list.size();
			System.out.println("ƽ���ɼ�Ϊ" + averagescore);
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
