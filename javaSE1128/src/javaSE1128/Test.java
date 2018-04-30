package javaSE1128;

import java.io.File;
import java.io.IOException;

import file.FileUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	File file = new File("e:/kaisheng25/code/abcd");
		File fil = new File("e:/kaisheng25/code/abc");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.exists());
		System.out.println(fil.exists());
		System.out.println(file.getTotalSpace());
		System.out.println(fil.getTotalSpace());
		
		long long1 = file.getTotalSpace();
		long kb = long1/1024;
		long mb = long1/(1024*1024);
		long gb = long1/(1024*1024*1024);
		System.out.println(kb+"KB");
		System.out.println(mb+"MB");
		System.out.println(gb+"GB");*/
		
		
	/*	File file3 = new File("e:/kaisheng25");
		File[] files = file3.listFiles();
		System.out.println(files==null);
		File file = new File("e:/screenshot");
		System.out.println(FileUtil.add(file));
		*/
		String aString =FileUtil.getReadSpace(40288178176.0);
		System.out.println(aString);
	/*	String[] strings = file.list();
		for(String str : strings) {
			System.out.println(str);
		}
		String string1  = file.getAbsolutePath();
		String string2  = file.getPath();
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string1.equals(string2));*/
		
		
		
		
		
		
		
//		Phonemap phonemap = new Phonemap();
//		phonemap.startup();
//		StudentList studentList = new StudentList();
//		studentList.startup();
//		Phonemap2 phonemap2 = new Phonemap2();
//		phonemap2.startup();
		
	}

}
