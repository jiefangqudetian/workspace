package kaishi1129;

import java.util.Scanner;

public class Bank {

	//��һ��
	/*	����ʽ
    private Bank (){}
	private Bank bank;
	public Bank getInstance() {
	if(bank == null) {
		bank = new Bank();
		return bank;
	}
	return bank;
	}*/

	/*����ʽ
    private Bank (){}
	private Bank bank = new Bank();
	public Bank getInstance() {
	return bank;
	}	*/
	
	//�ڶ���
		/*String string = "124324fdsafYUHN3232 �Ұ����й� GYjava ��� 3423";
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		for(int i = 0; i < string.length() ; i++) {
			int num = string.codePointAt(i);
			if(num > 47 && num < 58) {
				num1++;
			}else if(num > 64 && num < 91)  {
				num2++;
			}else if(num > 96 && num < 123) {
				num2++;
			}else if(num == 32) {
				num3++;
			}
		}
		num3 = string.length() - num1 - num2 - num3;
		
		System.out.println("��������Ϊ��" + num1 +"��ĸ����Ϊ��" + num2+"��������Ϊ��" + num3);*/
	
	
	/*int a = '0'; //48
	int b = '9'; //57
	int c = 'a'; //97
	int d = 'z'; //122
	int e = 'A'; //65
	int f = 'Z'; //90
	int g = ' '; //32
*/	
	
	//������
	/*Scanner input = new Scanner(System.in);
	System.out.println("���������֤����");
	String num = input.next();
	if(num.matches("[0-9]{17}[0-9_X]{1}")) {
		System.out.println("��ȷ");
		String year = num.substring(6, 10);
		String month = num.substring(10, 12);
		String day = num.substring(12, 14);
		String sex = num.substring(16);
		int sexx = Integer.valueOf(sex);
		if(sexx%2 == 1) 
		System.out.println("�������ڣ�"+year+"��"+month+"��"+day+"��"+"�Ա�Ϊ��"+(sexx%2 == 1?"��":"Ů"));
		
		
	} else {
		System.out.println("����");
	}*/
	
	
}
