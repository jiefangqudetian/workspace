package ever;

public class three {

	public static void main(String[] args) {
		

		java.util.Scanner input =new java.util.Scanner(System.in);
		
		
		String lastname = "";
		int i = 0;
		while(true) {
			System.out.println("�������˺�");
			String name = input.next();
			System.out.println("����������");
			String password = input.next();
			
			if(name.equals("tom") && password.equals("123")) {
				System.out.println("��¼�ɹ�");
				break;
			} else {
				System.out.println("�˺Ż������������");
				if(name.equals(lastname)) {
					i++;
				}else {
					lastname = name;
					i = 0;
					i++;
				}
			}
			if( i == 3) {
				System.out.println("�˺�����������Σ��˺ű�����");
				break;
			}
		}
		input.close();
	}

}
