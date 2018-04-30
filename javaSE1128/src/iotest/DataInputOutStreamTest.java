package iotest;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputOutStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream("e:/abc/data.dat"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println();
		
	}

}
