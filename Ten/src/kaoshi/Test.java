package kaoshi;

public class Test {

	public static void main(String[] args) {
		

		//��һ��
		int a = 0;
		a = (int)(Math.random()*10);
		System.out.println(a);
		
		
		
		//�ڶ���
		Child xiaoming = new Child();
		Shuxue shuxue = new Shuxue();
		
		xiaoming.study(shuxue);
		Kemu  kemu = xiaoming.teach();
		shuxue = (Shuxue)xiaoming.teach();
		shuxue = (Shuxue)kemu;
	}

}
