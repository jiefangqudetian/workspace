
public class Atm {

	Account account = new Account();
	Bank bank = new Bank();
	java.util.Scanner input = new java.util.Scanner(System.in);
	public void startup() {
		System.out.println("1.����");
		System.out.println("2.�忨");
		System.out.println("3.ϵͳ����");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		switch (input.nextInt()) {
		case 1:
			createaccount();
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
			System.out.println("ѡ��������������������");
			break;
		}
		startup();
	}
	private void insertcard() {
		// TODO Auto-generated method stub
		System.out.println("�������˻�");
		String name = input.next();
		System.out.println("����������");
		String password = input.next();
	    account = new Account();
		account=bank.findbynameandpassword(name, password);
		if(account!=null) {
			if(account.isState()) {
				System.out.println("��¼�ɹ�");
				showcardmenu();
			} else {
				System.out.println("�˻������ᣬ����ϵ����Ա");
			}
		} else {
			System.out.println("�˻��������������");
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
		System.out.println("1.��ʾ�˻�");
		System.out.println("2.�����˻�");
		System.out.println("3.�ⶳ�˻�");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		switch (input.nextInt()) {
		case 1:
			showallaccount();
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
			System.out.println("ѡ�������������������");
			break;
		}
		showmanagemenu();
	}
	private void recoveraccount() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�ⶳ�˻�");
		String name = input.next();
		Account account2 = bank.findbyname(name);
		if(account2!=null) {
			account2.setState(true);
		} else {
			System.out.println("���˻�������");
		}
		
	}
	private void frozenaccount() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�����˻�");
		String name = input.next();
		Account account2 = bank.findbyname(name);
		if(account2!=null) {
			account2.setState(false);
		} else {
			System.out.println("���˻�������");
		}
	}
	private void showallaccount() {
		// TODO Auto-generated method stub
		Account[] accounts = bank.getAccounts();
		for(int i = 0; i < accounts.length; i++) {
			if (accounts[i]!=null) {
				System.out.println(accounts[i].getName()+"\t\t"+(accounts[i].isState()?"����":"�쳣"));
			}
		}
	}
	private void showcardmenu() {
		// TODO Auto-generated method stub
		System.out.println("1.��ʾ���");
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
			tranmoney();
			break;
		case 5:
			fixpassword();
			break;
		case 6:
			startup();
			break;
		default:
			System.out.println("������������������");
			break;
		}
		showcardmenu();
	}
	
	private void fixpassword() {
		// TODO Auto-generated method stub
		System.out.println("������ԭ����");
		String password = input.next();
		if(account.getPassword().equals(password)) {
			account.setPassword(password);
			System.out.println("��������ɹ�");
		} else {
			System.out.println("�����������");
		}
	}
	private void tranmoney() {
		// TODO Auto-generated method stub
		System.out.println("������ת���˻�");
		String name = input.next();
		Account account2 = bank.findbyname(name);
		if(account2!=null) {
			System.out.println("������ת�˽��");
			int money = input.nextInt();
			if(money < 0 || money > account.getMoney()) {
				System.out.println("�����������");
			} else {
				account.setMoney(account.getMoney() - money);
				account2.setMoney(account2.getMoney() + money);
			}
		} else {
			System.out.println("���˻�������");
		}
	}
	private void outmoney() {
		// TODO Auto-generated method stub
		System.out.println("������ȡ����");
		int money = input.nextInt();
		if(money < 0 || money > account.getMoney()) {
			System.out.println("��������������������");
			inmoney();
		} else {
			account.setMoney(account.getMoney() - money);
			System.out.println("ȡ��ɹ�");
		}
		
	}
	private void inmoney() {
		// TODO Auto-generated method stub
		System.out.println("����������");
		int money = input.nextInt();
		if(money > 0) {
			account.setMoney(account.getMoney() + money);
			System.out.println("���ɹ�");
		} else {
			System.out.println("��������������������");
			inmoney();
		}
	}
	private void showmoney() {
		// TODO Auto-generated method stub
		System.out.println(account.getMoney());
	}
	private void createaccount() {
		// TODO Auto-generated method stub
		System.out.println("�������˻�");
		String name = input.next();
		if(bank.findbyname(name)==null) {
			System.out.println("����������");
			String password = input.next();
			if(bank.savename(name, password)) {
				System.out.println("�����ɹ�");
			} else {
				System.out.println("����ʧ�ܣ�����ϵ����Ա");
			}
		} else {
			System.out.println("�û�����ռ��");
		}
		
	}
}
