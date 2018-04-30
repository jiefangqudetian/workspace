import java.util.Scanner;
import java.util.Set;

public class Atm {

	Account account = new Account();
	Bank bank = Bank.getInstance();
	Scanner input = new Scanner(System.in);
	public void startup() {
		System.out.println("1.����");
		System.out.println("2.�忨");
		System.out.println("3.ϵͳ����");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		switch (input.nextInt()) {
		case 1:
			
			System.out.println("�������˻�");
			String name = input.next();
			
			if(bank.maps.containsKey(name)) {
				System.out.println("�˻��Ѵ���");
			} else {
				System.out.println("����������");
				String password =input.next();
				Account acc = new Account();
				acc.setName(name);
				acc.setPassword(password);
				bank.maps.put(name, acc);
				System.out.println("�����ɹ�");
			}
			break;
		case 2:
			
			System.out.println("�������˻�");
			String name1 = input.next();
			System.out.println("����������");
			String password1 = input.next();
			if(bank.maps.containsKey(name1)){
				account = bank.maps.get(name1);
				
				if(account.getPassword().equals(password1)) {
					System.out.println("��¼�ɹ�");
					showAccountView();
				}
				
			} else {
				System.out.println("�˻��������������");
			}
			
			
			break;
		case 3:
			
			System.out.println("���������Ա����");
			String password2 = input.next();
			if(password2.equals("123456")) {
				showMangageMenu();
			} else {
				System.out.println("�����������");
			}
			break;
		case 4:
			System.exit(0);
			
			break;

		default:
			System.out.println("ѡ�������������������");
			break;
		}
		startup();
	}
		
	private void showMangageMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.�鿴�˻�״̬");
		System.out.println("2.�����˻�");
		System.out.println("3.�ⶳ�˻�");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		int num = input.nextInt();
		switch (num) {
		case 1:
			Set<String> sets = bank.maps.keySet();
			for(String string : sets) {
				Account acc = bank.maps.get(string);
				System.out.println(string + "  "+(acc.isState()?"����" : "�쳣"));
			}
			break;
		case 2:
			System.out.println("������Ҫ�����˻�");
			String named = input.next();
			if(bank.maps.containsKey(named)) {
				Account accd = bank.maps.get(named);
				accd.setState(false);
			} else{
				System.out.println("�˻�������");
			}
			break;
		case 3:
			System.out.println("������Ҫ�ⶳ�˻�");
			String namej = input.next();
			if(bank.maps.containsKey(namej)) {
				Account accj = bank.maps.get(namej);
				accj.setState(true);
			} else{
				System.out.println("�˻�������");
			}
			break;
			
		case 4:
			startup();
			break;

		default:
			break;
		}
	}
	
	private void showAccountView() {
		// TODO Auto-generated method stub
		System.out.println("1.��ѯ���");
		System.out.println("2.���");
		System.out.println("3.ȡ��");
		System.out.println("4.ת��");
		System.out.println("5.�޸�����");
		System.out.println("6.�˳�");
		System.out.println("������ѡ��");
		switch (input.nextInt()) {
		case 1:
			System.out.println(account.getMoney());
			break;
		case 2:
			System.out.println("���������");
			int inmoney = input.nextInt();
			if(inmoney<0){
				System.out.println("����������");
			} else {
				account.setMoney(inmoney+account.getMoney());
				System.out.println("���ɹ�");
			}
			break;
		case 3:
			System.out.println("������ȡ���");
			int outmoney = input.nextInt();
			if(outmoney<0 || outmoney>account.getMoney()) {
				System.out.println("����������");
			} else {
				account.setMoney(account.getMoney()-outmoney);
				System.out.println("ȡ��ɹ�");
			}
			break;
		case 4:
			System.out.println("������ת���˻�");
			String name = input.next();
			if(bank.maps.containsKey(name)) {
				Account acc = bank.maps.get(name);
				
				System.out.println("������ת�˶�");
				int tranmoney = input.nextInt();
				if(tranmoney<0 || tranmoney>account.getMoney()) {
					System.out.println("����������");
				} else {
					account.setMoney(account.getMoney()-tranmoney);
					acc.setMoney(acc.getMoney()+tranmoney);
					System.out.println("ת�˳ɹ�");
				}
			} else {
				System.out.println("�˻��������");
				
			}
			break;
		case 5:
			System.out.println("������ԭʼ����");
			String oldpassword = input.next();
			if(account.getPassword().equals(oldpassword)) {
				System.out.println("������������");
				String newpassword = input.next();
				account.setPassword(newpassword);
			} else {
				System.out.println("�����������");
			}
			break;
		case 6:
			startup();
			break;

		default:
			break;
		}
		
		
		showAccountView();
	}
}
