
public class Atm {

	java.util.Scanner input = new java.util.Scanner(System.in);
	Bank bank = new Bank();
	Account account = new Account();
	
	public void startup() {
		System.out.println("1.����");
		System.out.println("2.�忨");
		System.out.println("3.ϵͳ����");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		
		switch (input.nextInt()) {
		case 1:
			CreatAccount();
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
			System.out.println("ѡ���������");
			break;
		}
		startup();
	}
	private void CreatAccount() {
		System.out.println("�������˻�");
		String name = input.next();
		Account account =  bank.findbyname(name);
		if(account==null) {
			System.out.println("����������");
			String password = input.next();
			System.out.println(bank.savename(name, password)?"�����ɹ�":"����ʧ�ܣ�����ϵ����Ա");
		} else {
			System.out.println("�û����ѱ�ռ��");
		}
		
	}
	private void insertcard() {
		System.out.println("�������˻�");
		String name = input.next();
		System.out.println("����������");
		String password = input.next();
		account = bank.namematchpassword(name, password);
		if(account!=null) {
			if(account.isState()) {
				System.out.println("��¼�ɹ�");
				showcardmenu();
			} else{
				System.out.println("�˻������ᣬ����ϵ����Ա");
			}
		} else {
			System.out.println("�˻��������������");
		}
		startup();
	}
	private void showcardmenu() {
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
			int money1 = input.nextInt();
			if(money1 < 0 ) {
				System.out.println("����������");
			} else {
			account.setMoney(account.getMoney()+money1);
			System.out.println("���ɹ��������ϼ��˵�");}
			break;
		case 3:
			System.out.println("������ȡ���");
			int money2 = input.nextInt();
			if(money2 < 0 || money2 > account.getMoney()) {
				System.out.println("����������");
			} else {
			account.setMoney(account.getMoney()-money2);
			System.out.println("ȡ��ɹ��������ϼ��˵�");}
			break;
		case 4:
			System.out.println("������ת���˻�");
			String name = input.next();
			if(bank.findbyname(name)!=null) {
				System.out.println("������ת�˽��");
				int money3 = input.nextInt();
				if(money3 < 0 || money3 > account.getMoney()) {
					System.out.println("����������");
				} else {
				Account account2 = bank.findbyname(name);
				account.setMoney(account.getMoney()-money3);
				account2.setMoney(account2.getMoney()+money3);
				System.out.println("ת�˳ɹ�");}
			} else {
				System.out.println("��Ҫת���˻�������");
			}
			break;
		case 5:
			System.out.println("������ԭʼ����");
			String password = input.next();
			if(account.getPassword().equals(password)) {
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
			System.out.println("ѡ���������");
			break;
		}
		showcardmenu();
	}
	private void systemmanage() {
		System.out.println("���������Ա����");
		String manageword = input.next();
		if(manageword.equals("123456")) {
			System.out.println("��¼�ɹ�");
			showmanagemenu();
		} else {
			System.out.println("�����������");
			startup();
		}
	}
	private void showmanagemenu() {
		System.out.println("1.��ʾ�˻�");
		System.out.println("2.�����˻�");
		System.out.println("3.�ⶳ�˻�");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		
		switch (input.nextInt()) {
		case 1:
			Account[] accounts = bank.getAccounts();
			for(int i = 0; i < accounts.length; i++) {
				if(accounts[i]!=null) {
					System.out.println(accounts[i].getName()+"\t"+(accounts[i].isState()?"����":"�쳣"));
				}
			}
			//bank.showaccount();
			break;
		case 2:
			System.out.println("������Ҫ�����˻�");
			String name = input.next();
			if(bank.findbyname(name)!=null) {
				Account account = bank.findbyname(name);
				account.setState(false);
				System.out.println("����ɹ�");
			} else {
				System.out.println("���˻�������");
			}
			break;
		case 3:
			System.out.println("������Ҫ�ⶳ�˻�");
			String name1 = input.next();
			if(bank.findbyname(name1)!=null) {
				Account account1 = bank.findbyname(name1);
				account1.setState(true);
				System.out.println("�ⶳ�ɹ�");
			} else {
				System.out.println("���˻�������");
			}
			break;
		case 4:
			startup();
			break;
		default:
			System.out.println("ѡ���������");
			break;
		}
		showmanagemenu();
	}
	
	
	
	
}
