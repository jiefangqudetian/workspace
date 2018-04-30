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
		System.out.println("1.添加");
		System.out.println("2.查询电话");
		System.out.println("3.查询联系人");
		System.out.println("4.删除电话");
		System.out.println("5.删除联系人");
		System.out.println("6.退出");
		System.out.println("请选择");
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
		System.out.println("请输入联系人");
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
			System.out.println("删除成功");
		} else {
			System.out.println("没有该联系人");
		}
	}
	private void deletenum() {
		// TODO Auto-generated method stub
		System.out.println("请输入电话");
		String num = input.next();
		if(maps.containsKey(num)) {
			maps.remove(num);
			System.out.println("删除成功");
		} else{
			System.out.println("电话号码不存在");
		}
	}
	private void findname() {
		// TODO Auto-generated method stub
		System.out.println("请输入联系人");
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
				System.out.println(name + "：  " + list.get(i));
			}
		} else {
			System.out.println("没有该联系人");
		}
	}
	private void findnum() {
		// TODO Auto-generated method stub
		System.out.println("请输入电话");
		String num = input.next();
		String name = maps.get(num);
		if(name!=null) {
			System.out.println("联系人为：" + name );
		} else{
			System.out.println("电话号码不存在");
		}
	}
	private void add() {
		// TODO Auto-generated method stub
		System.out.println("请输入电话");
		String num = input.next();
		if (maps.containsKey(num)) {
			System.out.println("电话号码已存在");
		} else {
			System.out.println("请输入联系人");
			String name = input.next();
			maps.put(num, name);
			System.out.println("添加成功");
		}
	}
}
