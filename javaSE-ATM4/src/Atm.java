
public class Atm {


	Account account = new Account();
	Account[] accounts = new Account[10];
	java.util.Scanner input= new java.util.Scanner(System.in);
	
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
			insertaccount();
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

	private void systemmanage() {
		// TODO Auto-generated method stub
		System.out.println("���������Ա����");
		String password = input.next();
		if(password.equals("123456")) {
			showmanagemenu();
		} else {
			System.out.println("�����������");
			startup();
		}
	}

	private void showmanagemenu() {
		// TODO Auto-generated method stub
		System.out.println("1.��ʾ�����˻�");
		System.out.println("2.�����˻�");
		System.out.println("3.�ⶳ�˻�");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		switch (input.nextInt()) {
		case 1:
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i]!=null) {
					System.out.println(accounts[i].getName()+"\t\t"+(accounts[i].isState()?"����":"�쳣"));
				}
			}
			break;
		case 2:
			System.out.println("������Ҫ�����˻�");
			String name = input.next();
			if(findbyname(name)!=null) {
				findbyname(name).setState(false);
			} else {
				System.out.println("���˻�������");
			}
			break;
		case 3:
			System.out.println("������Ҫ����˻�");
			String name1 = input.next();
			if(findbyname(name1)!=null) {
				findbyname(name1).setState(true);
			} else {
				System.out.println("���˻�������");
			}
			break;
		case 4:
			startup();
			break;
		default:
			break;
		}
		showmanagemenu();
	}

	private void insertaccount() {
		// TODO Auto-generated method stub
		System.out.println("�������˻���");
		String name = input.next();
		System.out.println("����������");
		String password = input.next();
		if(findbynameandpassword(name, password)!=null) {
			account=findbynameandpassword(name, password);
			System.out.println("��¼�ɹ�");
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
			System.out.println(account.getMoney());
			break;
		case 2:
			System.out.println("���������");
			int inmoney = input.nextInt();
			if(inmoney>0) {
				account.setMoney(account.getMoney() + inmoney);
				System.out.println("���ɹ�");
			} else {
				System.out.println("����������");
			}
			break;
		case 3:
			System.out.println("������ȡ���");
			int outmoney = input.nextInt();
			if(outmoney<0 || outmoney>account.getMoney()) {
				System.out.println("����������");
			} else {
				account.setMoney(account.getMoney() - outmoney);
				System.out.println("ȡ��ɹ�");
			}
			break;
		case 4:
			System.out.println("������ת���˻�");
			String zhuanname = input.next();
			if(findbyname(zhuanname)!=null) {
				Account account1 = findbyname(zhuanname);
				System.out.println("������ת���");
				int zhuanmoney = input.nextInt();
				if(zhuanmoney<0 || zhuanmoney>account.getMoney()) {
					System.out.println("����������");
				} else {
					account.setMoney(account.getMoney() - zhuanmoney);
					account1.setMoney(account1.getMoney() + zhuanmoney);
					System.out.println("ת�˳ɹ�");
				}
			} else {
				System.out.println("ת���˻�������");
			}
			break;
		case 5:
			System.out.println("������ԭʼ����");
			String password = input.next();
			if(account.getPassword().equals(password)) {
				System.out.println("������������");
				String newpassword = input.next();
				account.setPassword(newpassword);
				System.out.println("�޸�����ɹ�");
			} else {
				System.out.println("ԭʼ�����������");
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

	private void createaccount() {
		// TODO Auto-generated method stub
		System.out.println("�������˻�");
		String name = input.next();
		if(findbyname(name)==null) {
			System.out.println("����������");
			String password = input.next();
			System.out.println(savename(name, password)?"�����ɹ�":"����ʧ�ܣ�����ϵ����Ա");
		} else {
			System.out.println("�û�����ռ��");
		}
	}
	
	private Account findbyname(String name) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null && accounts[i].getName().equals(name)){
				return accounts[i];
			}
		}
		return null;
	}
	
	private boolean savename(String name,String password) {
		for(int i = 0; i < accounts.length; i++){
			if(accounts[i]==null) {
				accounts[i]=new Account();
				accounts[i].setName(name);
				accounts[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	private Account findbynameandpassword(String name,String password){
		for(int i = 0; i < accounts.length; i++){
			if(accounts[i]!=null && accounts[i].getName().equals(name) && accounts[i].getPassword().equals(password)) {
				return accounts[i];
			}
		}
		return null;
	}
	
	
	
}
