package javaSE1128;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList2 {

	List<Student2> list = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	public void startup() {
		System.out.println("��ӭ����ѧ������ϵͳ");
		System.out.println("1.¼��ѧԱ��Ϣ");
		System.out.println("2.����ѧ�Ų�ѯѧԱ��Ϣ");
		System.out.println("3.�޸�ѧԱ��Ϣ");
		System.out.println("4.����ѧ��ɾ��ѧԱ��Ϣ");
		System.out.println("5.ͳ��ѧԱƽ�����Գɼ�");
		System.out.println("6.�˳�ϵͳ");
		System.out.println("������ѡ��");
		
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
			System.out.println("ѡ�������������������");
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
			System.out.println("ƽ���ɼ�Ϊ��0");
		} else {
			double average = (double)total/list.size();
			System.out.println("ƽ���ɼ�Ϊ��"+average);
		}
	}
	private void remove() {
		// TODO Auto-generated method stub
		System.out.println("������ѧ��");
		String code = input.next();
		if(findbycode(code)==null) {
			System.out.println("���޴���");
		} else {
			Student2 student2 = findbycode(code);
			list.remove(student2);
			System.out.println("ɾ���ɹ�");
		}
	
	}
	private void modify() {
		// TODO Auto-generated method stub
		System.out.println("������ѧ��");
		String code = input.next();
		if(findbycode(code)==null) {
			System.out.println("���޴���");
		} else {
			Student2 student2 = findbycode(code);
			System.out.println(student2);
			boolean flag = false;
			System.out.println("�Ƿ�Ҫ�޸�����(Y|N)?");
			String choice = input.next();
			if(choice.equalsIgnoreCase("y")){
				System.out.println("������������");
				String name = input.next();
				student2.setName(name);
				flag = true;
			} 
			
			System.out.println("�Ƿ�Ҫ�޸�����(Y|N)?");
			choice = input.next();
			if(choice.equalsIgnoreCase("y")){
				System.out.println("������������");
				int age = input.nextInt();
				student2.setAge(age);
				flag = true;
			} 
			
			System.out.println("�Ƿ�Ҫ�޸ĳɼ�(Y|N)?");
			choice = input.next();
			if(choice.equalsIgnoreCase("y")){
				System.out.println("�������³ɼ�");
				int score = input.nextInt();
				student2.setScore(score);
				flag = true;
			} 
			if(flag) {
				System.out.println("�޸ĳɹ�");
			}
		}
	}
	private void find() {
		// TODO Auto-generated method stub
		System.out.println("������ѧ��");
		String code = input.next();
		if(findbycode(code)==null) {
			System.out.println("���޴���");
		} else {
			Student2 student2 = findbycode(code);
			System.out.println(student2);
		}
	}
	private void save() {
		// TODO Auto-generated method stub
		System.out.println("������ѧ��");
		String code = input.next();
		if(findbycode(code)==null) {
			System.out.println("����������");
			String name = input.next();
			System.out.println("����������");
			int age = input.nextInt();
			System.out.println("������ɼ�");
			int score = input.nextInt();
			Student2 student2 = new Student2(code, name, age, score);
			list.add(student2);
			System.out.println("¼��ɹ�");
		} else {
			System.out.println("ѧ���Ѵ���");
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
