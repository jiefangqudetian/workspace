
public class Atm {

	Account[] accounts = new Account[10];
	Account account = new Account();
	java.util.Scanner input = new java.util.Scanner(System.in);

	public void startup() {
		System.out.println("1.����");
		System.out.println("2.�忨");
		System.out.println("3.ϵͳ����");
		System.out.println("4.�˳�");
		System.out.println("������ѡ��");
		String option = input.next();
		if (option.equals("1")) {
			System.out.println("�������˻�");
			String name = input.next();
			boolean flag1 = true;
			boolean flag2 = false;
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null && accounts[i].getName().equals(name)) {
					System.out.println("�û����ѱ�ռ��");
					flag1 = false;
					break;
				}
			}
			if (flag1) {
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						System.out.println("����������");
						String password = input.next();
						accounts[i] = new Account();
						accounts[i].setName(name);
						accounts[i].setPassword(password);
						System.out.println("�����ɹ�");
						flag2 = false;
						break;
					}
				}
			}
			if (flag2) {
				System.out.println("����ʧ�ܣ�����ϵ����Ա");
			}
		} else if (option.equals("2")) {
			System.out.println("�������˻�");
			String name = input.next();
			System.out.println("����������");
			String password = input.next();
			boolean flag1 = false;
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null && accounts[i].getName().equals(name)
						&& accounts[i].getPassword().equals(password)) {
					account = accounts[i];
					System.out.println("��¼�ɹ�");
					flag1 = true;
				}
			}
			if (flag1) {
				while (true) {
					System.out.println("1.��ѯ���");
					System.out.println("2.���");
					System.out.println("3.ȡ��");
					System.out.println("4.ת��");
					System.out.println("5.�޸�����");
					System.out.println("6.�˳�");
					System.out.println("������ѡ��");
					String option1 = input.next();
					if (option1.equals("1")) {
						System.out.println(account.getMoney());
					} else if (option1.equals("2")) {
						System.out.println("���������");
						int money = input.nextInt();
						if (money < 0) {
							System.out.println("����������");
						} else {
							account.setMoney(account.getMoney() + money);
						}
					} else if (option1.equals("3")) {
						System.out.println("������ȡ���");
						int money = input.nextInt();
						if (money < 0 || money > account.getMoney()) {
							System.out.println("����������");
						} else {
							account.setMoney(account.getMoney() - money);
						}

					} else if (option1.equals("4")) {
						System.out.println("������ת���˻�");
						String inname = input.next();
						boolean flag2 = true;
						for (int i = 0; i < accounts.length; i++) {
							if (accounts[i] != null && accounts[i].getName().equals(inname)) {
								Account account1 = new Account();
								account1 = accounts[i];
								System.out.println("������ת�˶�");
								int money = input.nextInt();
								if (money < 0 || money > account.getMoney()) {
									System.out.println("����������");
								} else {
									account.setMoney(account.getMoney() - money);
									account1.setMoney(account1.getMoney() + money);
								}
								System.out.println("ת�˳ɹ�");
								flag2 = false;
								break;
							}
						}
						if(flag2) {
							System.out.println("���޴���");
						}

					} else if (option1.equals("5")) {
						System.out.println("������ԭ����");
						String password1 = input.next();
						if(password1.equals(account.getPassword())) {
							System.out.println("������������");
							String password2 = input.next();
							account.setPassword(password2);
						} else {
							System.out.println("�����������");
						}
					} else if (option1.equals("6")) {
						break;
					} else {
						System.out.println("ѡ��������������������");
					}
				}
			} else {
				System.out.println("�˻����������");
			}

		} else if (option.equals("3")) {

			System.out.println("���������Ա����");
			String password = input.next();
			if(password.equals("123456")) {
				while(true){
					System.out.println("1.��ʾ�˻�");
					System.out.println("2.�����˻�");
					System.out.println("3.�ⶳ�˻�");
					System.out.println("4.�˳�");
					System.out.println("������ѡ��");
					String option1 = input.next();
					if(option1.equals("1")) {
						for (Account account : accounts) {
							if(account!=null && account.isState()==true) {
								System.out.println(account.getName() + "\t\t" +"����");
							} else if(account!=null && account.isState()==false) {
								System.out.println(account.getName() + "\t\t" +"�쳣");
							}  
						}
					} else if(option1.equals("2")) {
						System.out.println("������Ҫ�����˻�");
						String name = input.next();
						boolean flag = true;
						for (int i = 0; i < accounts.length; i++) {
							if (accounts[i]!=null && accounts[i].getName().equals(name)) {
								Account account = new Account();
								account = accounts[i];
								account.setState(false);
								System.out.println("����ɹ�");
								flag = false;
								break;
							}
						}
						if(flag) {
							System.out.println("���˻�������");
						}
						
					} else if(option1.equals("3")) {
						System.out.println("������Ҫ�ⶳ�˻�");
						String name = input.next();
						boolean flag = true;
						for (int i = 0; i < accounts.length; i++) {
							if (accounts[i]!=null && accounts[i].getName().equals(name)) {
								Account account = new Account();
								account = accounts[i];
								account.setState(true);
								System.out.println("���ɹ�");
								flag = false;
								break;
							}
						}
						if(flag) {
							System.out.println("���˻�������");
						}
						
					} else if(option1.equals("4")) {
						break;
					} else{
						System.out.println("ѡ�������������������");
					}
				}
			} else {
				System.out.println("�����������");
			}
		} else if (option.equals("4")) {
			System.exit(0);
		} else {
			System.out.println("ѡ�������������������");
		}
		startup();

	}
}
