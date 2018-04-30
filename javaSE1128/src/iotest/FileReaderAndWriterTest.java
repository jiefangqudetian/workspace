package iotest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileReaderAndWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
//			FileWriter writer = new FileWriter("e:/abc/123.txt",true);
//			writer.write("123");
//			writer.write("Äã¾ÍÊÇÎ¨Ò»");
//			writer.flush();
//			writer.close();
			
//			FileReader reader = new FileReader("e:/abc/123.txt");
//			int len = 0;
//			int i = 0;
//			StringBuilder builder = new StringBuilder();
//			while((len = reader.read())!=-1) {
//				builder.append((char)len);
//				i++;
//			}
//			System.out.println(builder.toString());
//			System.out.println(i);
//			reader.close();
			
			FileReader reader = new FileReader("e:/abc/123.txt");
			char[] buffer = new char[2];
			int len = -1;
			int i = 0;
			StringBuilder builder = new StringBuilder();
			while((len = reader.read(buffer)) != -1) {
				builder.append(buffer, 0, len);
				i++;
			}
			
			System.out.println(builder.toString());
			System.out.println(i);
			
			reader.close();
			
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
