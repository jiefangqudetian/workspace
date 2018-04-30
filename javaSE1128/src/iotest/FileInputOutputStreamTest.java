package iotest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStreamTest {

	public static void main(String[] args) {

		
		try {
			
			FileInputStream inputStream = new FileInputStream("e:/abc/1.bmp");
			FileOutputStream outputStream = new FileOutputStream("e:/abc/2.bmp");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
			
			int leng = 0;
			while ((leng = bufferedInputStream.read()) != -1) {
				bufferedOutputStream.write(leng);
			}
			
			
//			byte[] buffer = new byte[1024];
//			while ((leng = inputStream.read(buffer)) != -1) {
//				outputStream.write(buffer,0,leng );
//			}
			
			
//			while ((leng = inputStream.read()) != -1) {
//				outputStream.write(leng );
//			}
			
			
//			while( true) {
//				leng = inputStream.read();
//				if(leng == -1) {
//					break;
//				}
//				outputStream.write(leng );
//			}
//			while( true) {
//				leng = inputStream.read();
//				if(leng == -1) {
//					break;
//				}
//				outputStream.write(leng );
//			}
			
			
			
			
			
			
			
			/*while(inputStream.read() == -1) {
				outputStream.write(inputStream.read());
			}*/
			
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
			bufferedInputStream.close();
			outputStream.flush();
			outputStream.close();
			inputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
				
				
				
		
	}

}
