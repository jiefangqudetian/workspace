package javaSE1128;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonemap {

	Map<String, String> maps = new HashMap<>();
	Scanner input = new Scanner(System.in);
	public void startup() {
		System.out.println("1.���");
		System.out.println("2.��ѯ");
		System.out.println("3.ɾ��");
		System.out.println("������ѡ��");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("����������");
			String name = input.next();
			if(maps.containsKey(name)) {
				System.out.println("�û��Ѵ���");
			} else {
				System.out.println("������绰");
				String number = input.next();
				maps.put(name, number);
				System.out.println("��ӳɹ�");
				
			}
			break;
		case 2:
			System.out.println("����������");
			String namec = input.next();
			if(maps.containsKey(namec)) {
				System.out.println(maps.get(namec));
			} else {
				System.out.println("�û�������");
			}
			
			break;
		case 3:
			System.out.println("����������");
			String names = input.next();
			if(maps.containsKey(names)) {
				maps.remove(names);
				System.out.println("ɾ���ɹ�");
			} else {
				System.out.println("�û�������");
			}
			
			break;

		default:
			break;
		}
		startup();
	}
}
