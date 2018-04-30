package javaSE1125;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//第一题
		int num = (int)(Math.random()*10);
		
		//第二题
		Child child = new Child();
		Jinmao jack = new Jinmao();
		child.feed(jack);
		
		Integer a = 50;
		Integer b = 50;
		System.out.println(a==b);
		
		Jinmao dJinmao = new Jinmao();
		Jinmao xJinmao = new Jinmao();
		dJinmao.age = 20;
		xJinmao.age = 5;
		xJinmao.age = 100;
		System.out.println(dJinmao.age);
		String stu = "123";
		
		String str1 = new String();
		String[] str2 = new String[10];
		String str3 = "abc";
		
		
		
	}

}
