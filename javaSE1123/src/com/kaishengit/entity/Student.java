package com.kaishengit.entity;

public class Student {

	public String name;
	public  int age;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void sayHello() {
		System.out.println("Hello..");
		
	}
	
	public void sayHi() {
		System.out.println("Hi..");
		sayHello();
		
		//Math.max(3, 5);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void say() {
		String num;
		System.out.println(name);
//		System.out.println(num);
	}
}
