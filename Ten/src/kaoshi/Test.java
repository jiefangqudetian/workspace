package kaoshi;

public class Test {

	public static void main(String[] args) {
		

		//第一题
		int a = 0;
		a = (int)(Math.random()*10);
		System.out.println(a);
		
		
		
		//第二题
		Child xiaoming = new Child();
		Shuxue shuxue = new Shuxue();
		
		xiaoming.study(shuxue);
		Kemu  kemu = xiaoming.teach();
		shuxue = (Shuxue)xiaoming.teach();
		shuxue = (Shuxue)kemu;
	}

}
