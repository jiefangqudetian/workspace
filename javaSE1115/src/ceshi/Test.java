package ceshi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nam = "Tom";
		String passw = "123";
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("�������û���");
		String name = input.next();
		System.out.println("����������");
		String password = input.next();
		
		for(int i = 0; i < 3; i++) {
			if (name.equals("Tom") && password.equals("123")){
				System.out.println("��¼�ɹ�");
				break;
			}
			
			
		}
		
		
		
	}

}
