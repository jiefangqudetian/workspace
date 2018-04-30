package iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReaderAndOutStreamWritter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream("e:/abc/RNG.txt"));
//			char[] cha = new char[512];
//			int length;
//			StringBuffer buffer = new StringBuffer();
//			while ((length = reader.read(cha))!=-1) {          //????
//				buffer = buffer.append(cha,0,length);
//			}
//			reader.close();
//			System.out.println(buffer.toString());
//			StringBuffer buff = new StringBuffer();
			int len = -1;
			while ((len = reader.read())!=-1) {
				char ch = (char)len;
				System.out.print(ch);
//				buff.append(ch);
			}
//			System.out.println(buff.toString());
			reader.close();
			
			
			
			
			
	/*		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("e:/abc/RNG.txt"));
			outputStreamWriter.write("我嫉妒你的爱气势如虹\n");
			outputStreamWriter.write("像个人气高居不下的天后\n");
			outputStreamWriter.write("你要的不是我\n");
			outputStreamWriter.write("而是一种虚荣\n");
			outputStreamWriter.flush();
			outputStreamWriter.close();*/
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
