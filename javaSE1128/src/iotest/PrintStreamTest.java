package iotest;

import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			PrintStream stream = new PrintStream("e:/abc/abc");
			stream.println("Ò¯Ò¯ÅÝµÄ²è");
//			stream = null;
//			stream.println("°Ö°ÖÅÝµÄ²è");
			stream.flush();
			stream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
