
public class Atm {

	private java.util.Scanner input = new java.util.Scanner(System.in);
	private Bank bank = new Bank();
	private Account account = null;
	public void startup() {
		System.out.println("1.����");
		System.out.println("2.�忨");
		System.out.println("3.ϵͳ����");
		System.out.println("4.�˳�");
		int num = input.nextInt();
		if(num == 1) {
			creataccount();
		}else if(num == 2) {
			insertcard();
		}else if(num == 3) {
			systemmange();
		}else if(num == 4) {
			System.exit(0);
		}else {
			System.out.println("������������������");
		}
		startup();
	}

	private void systemmange() {
		// TODO Auto-generated method stub
		System.out.println("���������Ա����");
		String word = input.next();
		if(word.equals("123456")) {
			System.out.println("��¼�ɹ�");
			showmangemenu();
		} else {
			System.out.println("�����������");
		}
	}

	private void showmangemenu() {
		// TODO Auto-generated method stub
		System.out.println("1.��ʾ�����û�");
		System.out.println("2.�����˻�");
		System.out.println("3.�ָ��˻�");
		System.out.println("4.�˳�");
		System.out.println("��ѡ��");
		int option = input.nextInt();
		switch (option) {
		case 1:
			bank.ShowAccountsEnable();
			break;
		case 2:
			frozen();
			break;
		case 3:
			recover();
			break;
		case 4:
			startup();
			break;
		default:
			break;
		}
		showmangemenu();
	}

	private void recover() {
		// TODO Auto-generated method stub
		bank.ShowAccountsEnable();
		System.out.println("������Ҫ�ָ��˻�");
		String name = input.next();
		if(bank.findbyname(name)!=null) {
			bank.recoverAccounts(bank.findbyname(name));
		} else {
			System.out.println("���˻������ڣ�����������");
			recover();
		}
	}

	private void frozen() {
		// TODO Auto-generated method stub
		bank.ShowAccountsEnable();
		System.out.println("������Ҫ�����˻�");
		String name = input.next();
		if(bank.findbyname(name)!=null) {
			bank.frozenAccounts(bank.findbyname(name));
		} else {
			System.out.println("���˻������ڣ�����������");
			frozen();
		}
	}


	private void creataccount() {
		/*if(bank.jiance()) {
			System.out.println("�˻��������޷�����");
			startup();
		}*/
		System.out.println("�������˺�");
		String name = input.next();
		if(bank.findbyname(name)!=null) {
			System.out.println("�û����ѱ�ռ��");
			creataccount();
		}else {
			System.out.println("����������");
			String password = input.next();
			bank.savename(name,password);
			startup();
		}
	}
	
	private void insertcard() {
		
		System.out.println("�������˻�");
		String name = input.next();
		System.out.println("����������");
		String password = input.next();
		
		account = bank.findbynameandpassword(name, password);          //����ҵ�amount[i],���丳ֵ��amount
		
		if(account==null) {                                            //               �˺�������� 
			System.out.println("�˻��������������");
			insertcard();
		} else if(account.isEnable()) {                                //��¼�ɹ�
			System.out.println("��¼�ɹ�");
			showcardmenu();
		} else {
			System.out.println("�˻�����");
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
		
		int num = input.nextInt();
		if(num == 1) {
			showmoney();
		} else if(num == 2) {
			inmoney();
		} else if(num == 3) {
			drawmoney();
		} else if(num == 4) {
			tranmoney();
		} else if(num == 5) {
			fixpassword();
		} else if(num == 6) {
			startup();
		}
		
		
	}

	private void showmoney() {
		// TODO Auto-generated method stub
		System.out.println(account.getMoney());
		showcardmenu();
	}
	
	private void inmoney() {
		// TODO Auto-generated method stub
		System.out.println("���������");
		int money = input.nextInt();
		if(money < 0) {
			System.out.println("��ʽ������󣬷�����һ��");
			showcardmenu();
		} else {
			account.setMoney(account.getMoney()+money);
			System.out.println("���ɹ�");
			showcardmenu();
		}
	}
	
	private void drawmoney() {
		// TODO Auto-generated method stub
		System.out.println("������ȡ���");
		int money = input.nextInt();
		if(money<0 || money>account.getMoney()) {
			System.out.println("��ʽ������󣬷�����һ��");
		} else {
			account.setMoney(account.getMoney()-money);
			System.out.println("ȡ��ɹ�");
			showcardmenu();
		}
	}
	
	private void fixpassword() {
		// TODO Auto-generated method stub
		System.out.println("������ԭʼ����");
		String word = input.next();
		
		if(word.equals(account.getPassword())) {
			System.out.println("������������");
			account.setPassword(input.next());
			System.out.println("�޸�����ɹ�");
			showcardmenu();
		} else {
			System.out.println("ԭʼ����������󣬷�����һ��");
			showcardmenu();
		}
	}

	private void tranmoney() {
		// TODO Auto-generated method stub
		System.out.println("������ת���˺�");
		String name = input.next();
		Account inAccount = null;
		inAccount=bank.findbyname(name);
		if(inAccount!=null) {
			System.out.println("��������");
			int money = input.nextInt();
			if(money > account.getMoney() || money < 0) {
				System.out.println("���������󣬷�����һ��");
				showcardmenu();
			} else {
				System.out.println("ת�˳ɹ�");
				account.setMoney(account.getMoney()-money);
				inAccount.setMoney(inAccount.getMoney()+money);
				showcardmenu();
			}
			
			
		} else {
			System.out.println("�����˻������ڣ�������һ��");
			showcardmenu();
		}
	}

	

	

	
	
}
