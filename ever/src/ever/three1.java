package ever;

public class three1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		int i = 0;
		String lastname = "tom";
		while (true) {
			System.out.println("�������˺�");
			String name = input.next();
			System.out.println("����������");
			String password = input.next();
			if(name.equals("tom") && password.equals("123")) {
				System.out.println("��¼�ɹ�");
			} else {
				System.out.println("��¼ʧ��");
				if(name.equals(lastname)){
					i++;
				} else {
					lastname = name;
					i = 0;
					i++;
				}
			}
			if(i == 3) {
				System.out.println("����������������˻��ѱ�����");
			}
			input.close();
		}
	}

}
