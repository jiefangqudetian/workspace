package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		Thread1 thread1 = new Thread1();
//		thread1.start();
//
//		for (int i = 0; i < 100; i++) {
//			try {
//				
//				Thread.sleep(100);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//			System.out.println("main " + i);
//		}
		try {
			
			FileInputStream fileInputStream =new FileInputStream("d:/1.jpg");
			FileOutputStream outputStream = new FileOutputStream("e:/1.jpg");
			fileInputStream.read();
			int len = 0;
			while((len = fileInputStream.read()) == -1) {
				outputStream.write(len);
			}
			
			outputStream.flush();
			outputStream.close();
			fileInputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
				
	}

}
