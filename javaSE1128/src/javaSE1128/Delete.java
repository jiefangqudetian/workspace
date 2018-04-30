package javaSE1128;

import java.io.File;

public class Delete {

	public static void remove(File file) {
		while(true) {
			if(file.exists()) {
				romove(file);
			} else {
				break;
			}
		}
	}
	
	public static void romove(File file) {
		if(file.isFile()) {
			file.delete();
		} else if(file.listFiles().length==0) {
			file.delete();
		} else{
			File[] files = file.listFiles();
			for(File fil : files) {
				romove(fil);
			}
		}
	}
	
	public static void showFile(File file) {
		
		// 显示多层
		if(file.isFile()) {
			System.out.println(file.getName());
		} else {
			File[] files = file.listFiles();
			if(files != null) {
				for(File f : files) {
					showFile(f);
				}
			}
		}
	}
	
	public static void showFile(String path) {
		File file = new File(path);
		
		// 显示多层
		if(file.isFile()) {
			System.out.println(file.getName());
		} else {
			File[] files = file.listFiles();
			if(files != null) {
				for(File f : files) {
					showFile(f.getAbsolutePath());
				}
			}
		}
	}
}
