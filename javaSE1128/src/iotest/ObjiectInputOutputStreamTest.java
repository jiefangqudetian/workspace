package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.Address;
import entity.Student;

public class ObjiectInputOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("e:/abc/student.dat"));
			Student stu = (Student)objectInputStream.readObject();
			System.out.println(stu.getName());
			System.out.println(stu.getAge());
			System.out.println(stu.getAddress().getHome());
			System.out.println(stu.getAddress().getSchool());
			
			objectInputStream.close();
			
			
			
			/*ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("e:/abc/student.dat"));
			
			Address address = new Address();
			address.setHome("中南海");
			address.setSchool("中央党校");
			
			Student student = new Student();
			student.setAddress(address);
			student.setName("李克强");
			student.setAge(55);
			
			objectOutputStream.writeObject(student);
			objectOutputStream.flush();
			objectOutputStream.close();
			*/
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
