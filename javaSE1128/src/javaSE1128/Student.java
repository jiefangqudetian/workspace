package javaSE1128;

public class Student {

	private String xuehao;
	private String name;
	private String age;
	private int scores;
	
	/*public Student(String xuehao, String name, String age, int scores) {
		super();
		this.xuehao = xuehao;
		this.name = name;
		this.age = age;
		this.scores = scores;
	}*/
	@Override
	public String toString() {
		return "Student [xuehao=" + xuehao + ", name=" + name + ", age=" + age + ", scores=" + scores + "]";
	}
	public String getXuehao() {
		return xuehao;
	}
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
}
