package javaSE1128;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonemap {

	Map<String, String> maps = new HashMap<>();
	Scanner input = new Scanner(System.in);
	public void startup() {
		System.out.println("1.添加");
		System.out.println("2.查询");
		System.out.println("3.删除");
		System.out.println("请输入选项");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("请输入姓名");
			String name = input.next();
			if(maps.containsKey(name)) {
				System.out.println("用户已存在");
			} else {
				System.out.println("请输入电话");
				String number = input.next();
				maps.put(name, number);
				System.out.println("添加成功");
				
			}
			break;
		case 2:
			System.out.println("请输入姓名");
			String namec = input.next();
			if(maps.containsKey(namec)) {
				System.out.println(maps.get(namec));
			} else {
				System.out.println("用户不存在");
			}
			
			break;
		case 3:
			System.out.println("请输入姓名");
			String names = input.next();
			if(maps.containsKey(names)) {
				maps.remove(names);
				System.out.println("删除成功");
			} else {
				System.out.println("用户不存在");
			}
			
			break;

		default:
			break;
		}
		startup();
	}
}
