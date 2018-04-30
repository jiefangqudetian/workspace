import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Atm {

	Account account = new Account();
	List<Account> acclist = new ArrayList<>();
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
			
			if(bank.findbyname(name)!=null) {
				System.out.println("�˻��Ѵ���");
			} else {
				System.out.println("����������");
				String password =input.next();
				Account acc = new Account();
				acc.setName(name);
				acc.setPassword(password);
				bank.acclist.add(acc);
				System.out.println("�����ɹ�");
			}
			break;
		case 2:
			
			System.out.println("�������˻�");
			String name1 = input.next();
			System.out.println("����������");
			String password1 = input.next();
			account = bank.nameMatchPassword(name1, password1);
			if(account==null){
				System.out.println("�˻����������");
			} else  {
				showAccountView();
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
			for(int i = 0; i < bank.acclist.size(); i++) {
				Account acc = new Account();
				System.out.println(acc.getName() + (acc.isState()?"����" : "�쳣"));
			}
			break;
		case 2:
			System.out.println("������Ҫ�����˻�");
			String name = input.next();
			Account acc2 = bank.findbyname(name);
			if(acc2==null) {
				System.out.println("�˻�������");
			} else{
				acc2.setState(false);
			}
			break;
		case 3:
			System.out.println("������Ҫ�ⶳ�˻�");
			String name1 = input.next();
			Account acc3 = bank.findbyname(name1);
			if(acc3==null) {
				System.out.println("�˻�������");
			} else{
				acc3.setState(true);
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
			Account acc = bank.findbyname(name);
			if(acc==null) {
				System.out.println("�˻��������");
			} else {
				System.out.println("������ת�˶�");
				int tranmoney = input.nextInt();
				if(tranmoney<0 || tranmoney>account.getMoney()) {
					System.out.println("����������");
				} else {
					account.setMoney(account.getMoney()-tranmoney);
					acc.setMoney(acc.getMoney()+tranmoney);
					System.out.println("ת�˳ɹ�");
				}
				
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
