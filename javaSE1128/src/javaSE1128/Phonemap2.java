package javaSE1128;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Phonemap2 {

	Map<String, String> maps = new HashMap<>();
	Scanner input = new Scanner(System.in);
	public void startup() {
		System.out.println("1.���");
		System.out.println("2.��ѯ�绰");
		System.out.println("3.��ѯ��ϵ��");
		System.out.println("4.ɾ���绰");
		System.out.println("5.ɾ����ϵ��");
		System.out.println("6.�˳�");
		System.out.println("��ѡ��");
		switch (input.nextInt()) {
		case 1:
			add();
			break;
		case 2:
			findnum();
			break;
		case 3:
			findname();
			break;
		case 4:
			deletenum();
			break;
		case 5:
			deletename();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			break;
		}
		startup();
	}
	private void deletename() {
		// TODO Auto-generated method stub
		System.out.println("��������ϵ��");
		String name = input.next();
		List<String> list = new ArrayList<>();
		Set<Entry<String, String>> set = maps.entrySet();
		for(Entry<String, String>  entrys : set) {
			if(entrys.getValue()!=null && entrys.getValue().equals(name)) {
				
				list.add(entrys.getKey());
			}
			
		}
		if(list.size() > 0) {
			for(int i = 0; i < list.size(); i++) {
				maps.remove(list.get(i));
			}
			System.out.println("ɾ���ɹ�");
		} else {
			System.out.println("û�и���ϵ��");
		}
	}
	private void deletenum() {
		// TODO Auto-generated method stub
		System.out.println("������绰");
		String num = input.next();
		if(maps.containsKey(num)) {
			maps.remove(num);
			System.out.println("ɾ���ɹ�");
		} else{
			System.out.println("�绰���벻����");
		}
	}
	private void findname() {
		// TODO Auto-generated method stub
		System.out.println("��������ϵ��");
		String name = input.next();
		List<String> list = new ArrayList<>();
		Set<Entry<String, String>> set = maps.entrySet();
		for(Entry<String, String>  entrys : set) {
			if(entrys.getValue()!=null && entrys.getValue().equals(name)) {
				
				list.add(entrys.getKey());
			}
			
		}
		if(list.size() > 0) {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(name + "��  " + list.get(i));
			}
		} else {
			System.out.println("û�и���ϵ��");
		}
	}
	private void findnum() {
		// TODO Auto-generated method stub
		System.out.println("������绰");
		String num = input.next();
		String name = maps.get(num);
		if(name!=null) {
			System.out.println("��ϵ��Ϊ��" + name );
		} else{
			System.out.println("�绰���벻����");
		}
	}
	private void add() {
		// TODO Auto-generated method stub
		System.out.println("������绰");
		String num = input.next();
		if (maps.containsKey(num)) {
			System.out.println("�绰�����Ѵ���");
		} else {
			System.out.println("��������ϵ��");
			String name = input.next();
			maps.put(num, name);
			System.out.println("��ӳɹ�");
		}
	}
}
