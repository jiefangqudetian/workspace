package javaSE1128;

public class Student2 {

	private String code;
	private String name;
	private int age;
	private int score;
	
	public Student2(String code, String name, int age, int score) {
		super(); //可以去掉么
		this.code = code;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student2 [学号：" + code + ", 姓名：" + name + ", 年龄：" + age + ", 成绩" + score + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
