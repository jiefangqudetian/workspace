
public class Atm {
	Bank bank = new Bank();
	java.util.Scanner input = new java.util.Scanner(System.in);
	Account account;
	public void startup() {
		System.out.println("1.����");
		System.out.println("2.�忨");
		System.out.println("3.ϵͳ����");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		
		switch (input.nextInt()) {
		case 1:
			createaccounts();
			break;
		case 2:
			insertcard();
			break;
		case 3:
			systemmanage();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			break;
		}
		startup();
	}
	private void createaccounts() {
		// TODO Auto-generated method stub
		System.out.println("�������˻�");
		String name = input.next();
		if(bank.findbyname(name)!=null) {
			System.out.println("�û����Ѵ��ڣ�����������");
			createaccounts();
		} else {
			System.out.println("����������");
			String password = input.next();
			Account account = new Account();
			account.setName(name);
			account.setPassword(password);
			if(bank.savename(account)) {
				System.out.println("�����ɹ�");
			} else {
				System.out.println("����ʧ�ܣ�����ϵ����Ա");
			}
		}
	}
	
	private void insertcard() {
		// TODO Auto-generated method stub
		System.out.println("�������û���");
		String name = input.next();
		System.out.println("����������");
		String password = input.next();
		account = bank.findbynameandpassword(name, password);
		if(account!=null) {
			if(account.isState()) {
				System.out.println("��¼�ɹ�");
				showcardmenu();
			} else {
				System.out.println("�˻�������");
			}
			showcardmenu();
		} else {
			System.out.println("�˻��������������");
		}
	}
	private void showcardmenu() {
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
			showmoney();
			break;
		case 2:
			inmoney();
			break;
		case 3:
			outmoney();
			break;
		case 4:
			changemoney();
			break;
		case 5:
			changepassword();
			break;
		case 6:
			startup();
			break;
		default:
			System.out.println("ѡ�������������������");
			break;
		}
		showcardmenu();
	}
	private void showmoney() {
		System.out.println(account.getMoney());
		// TODO Auto-generated method stub
	}
	private void inmoney() {
		// TODO Auto-generated method stub
		System.out.println("����������");
		int money = input.nextInt();
		if(money > 0) {
			System.out.println("���ɹ�");
			account.setMoney(account.getMoney()+money);
		} else {
			System.out.println("����������");
		}
	}
	private void outmoney() {
		// TODO Auto-generated method stub
		System.out.println("������ȡ����");
		int money = input.nextInt();
		if(money < 0 || money > account.getMoney()) {
			System.out.println("����������");
		} else {
			account.setMoney(account.getMoney()-money);
			System.out.println("ȡ��ɹ�");
		}
		
	}
	private void changemoney() {
		// TODO Auto-generated method stub
		System.out.println("������ת���˻�");
		String name = input.next();
		Account account1 = bank.findbyname(name);
		if(account1!=null) {
			System.out.println("������ת�˽��");
			int money = input.nextInt();
			if(money < 0 || money > account.getMoney()) {
				System.out.println("����������");
			} else {
				account.setMoney(account.getMoney()-money);
				account1.setMoney(account1.getMoney()+money);
				System.out.println("ת�˳ɹ�");
			}
		} else {
			System.out.println("�˻�������");
		}
	}
	
	private void changepassword() {
		// TODO Auto-generated method stub
		System.out.println("������ԭʼ����");
		String password = input.next();
		if(account.getPassword().equals(password)) {
			System.out.println("������������");
			String newpassword = input.next();
			System.out.println("�����޸ĳɹ�");
			account.setPassword(newpassword);
		} else {
			System.out.println("ԭʼ�����������");
		}
	}
	
	private void systemmanage() {
		// TODO Auto-generated method stub
		System.out.println("���������Ա����");
		String password = input.next();
		if(password.equals("123456")) {
			showmanagemenu();
		} else {
			System.out.println("�����������");
		}
	}
	private void showmanagemenu() {
		// TODO Auto-generated method stub
		System.out.println("1.��ʾ�����û�״̬");
		System.out.println("2.�����˻�");
		System.out.println("3.�ⶳ�˻�");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		switch (input.nextInt()) {
		case 1:
			showaccountstate();
			break;
		case 2:
			frozenaccount();
			break;
		case 3:
			recoveraccount();
			break;
		case 4:
			startup();
			break;

		default:
			System.out.println("������������������");
			break;
		}
		showmanagemenu();
	}
	private void recoveraccount() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�ⶳ�˻�");
		String name = input.next();
		Account account = bank.findbyname(name);
		if(account==null) {
			System.out.println("���˻�������");
		} else {
			account.setState(true);
		}
		
	}
	private void frozenaccount() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�����˻�");
		String name = input.next();
		Account account = bank.findbyname(name);
		if(account==null) {
			System.out.println("���˻�������");
		} else {
			account.setState(false);
		}
	}
	private void showaccountstate() {
		// TODO Auto-generated method stub
		Account[] accounts = bank.getAccounts();
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null) {
				System.out.println(accounts[i].getName()+"\t\t"+(accounts[i].isState()?"����":"�쳣"));
			}
		}
	}

}
