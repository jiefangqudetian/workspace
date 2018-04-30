
public class Atm {

	Account[] accounts = new Account[10];
	Account account = new Account();
	java.util.Scanner input = new java.util.Scanner(System.in);

	public void startup() {
		System.out.println("1.开户");
		System.out.println("2.插卡");
		System.out.println("3.系统管理");
		System.out.println("4.退出");
		System.out.println("请输入选项");
		String option = input.next();
		if (option.equals("1")) {
			System.out.println("请输入账户");
			String name = input.next();
			boolean flag1 = true;
			boolean flag2 = false;
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null && accounts[i].getName().equals(name)) {
					System.out.println("用户名已被占用");
					flag1 = false;
					break;
				}
			}
			if (flag1) {
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						System.out.println("请输入密码");
						String password = input.next();
						accounts[i] = new Account();
						accounts[i].setName(name);
						accounts[i].setPassword(password);
						System.out.println("开户成功");
						flag2 = false;
						break;
					}
				}
			}
			if (flag2) {
				System.out.println("开户失败，请联系管理员");
			}
		} else if (option.equals("2")) {
			System.out.println("请输入账户");
			String name = input.next();
			System.out.println("请输入密码");
			String password = input.next();
			boolean flag1 = false;
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null && accounts[i].getName().equals(name)
						&& accounts[i].getPassword().equals(password)) {
					account = accounts[i];
					System.out.println("登录成功");
					flag1 = true;
				}
			}
			if (flag1) {
				while (true) {
					System.out.println("1.查询余额");
					System.out.println("2.存款");
					System.out.println("3.取款");
					System.out.println("4.转账");
					System.out.println("5.修改密码");
					System.out.println("6.退出");
					System.out.println("请输入选项");
					String option1 = input.next();
					if (option1.equals("1")) {
						System.out.println(account.getMoney());
					} else if (option1.equals("2")) {
						System.out.println("请输入存款额");
						int money = input.nextInt();
						if (money < 0) {
							System.out.println("金额输入错误");
						} else {
							account.setMoney(account.getMoney() + money);
						}
					} else if (option1.equals("3")) {
						System.out.println("请输入取款额");
						int money = input.nextInt();
						if (money < 0 || money > account.getMoney()) {
							System.out.println("金额输入错误");
						} else {
							account.setMoney(account.getMoney() - money);
						}

					} else if (option1.equals("4")) {
						System.out.println("请输入转账账户");
						String inname = input.next();
						boolean flag2 = true;
						for (int i = 0; i < accounts.length; i++) {
							if (accounts[i] != null && accounts[i].getName().equals(inname)) {
								Account account1 = new Account();
								account1 = accounts[i];
								System.out.println("请输入转账额");
								int money = input.nextInt();
								if (money < 0 || money > account.getMoney()) {
									System.out.println("金额输入错误");
								} else {
									account.setMoney(account.getMoney() - money);
									account1.setMoney(account1.getMoney() + money);
								}
								System.out.println("转账成功");
								flag2 = false;
								break;
							}
						}
						if(flag2) {
							System.out.println("查无此人");
						}

					} else if (option1.equals("5")) {
						System.out.println("请输入原密码");
						String password1 = input.next();
						if(password1.equals(account.getPassword())) {
							System.out.println("请输入新密码");
							String password2 = input.next();
							account.setPassword(password2);
						} else {
							System.out.println("密码输入错误");
						}
					} else if (option1.equals("6")) {
						break;
					} else {
						System.out.println("选项输入有误，请重新输入");
					}
				}
			} else {
				System.out.println("账户或密码错误");
			}

		} else if (option.equals("3")) {

			System.out.println("请输入管理员密码");
			String password = input.next();
			if(password.equals("123456")) {
				while(true){
					System.out.println("1.显示账户");
					System.out.println("2.冻结账户");
					System.out.println("3.解冻账户");
					System.out.println("4.退出");
					System.out.println("请输入选项");
					String option1 = input.next();
					if(option1.equals("1")) {
						for (Account account : accounts) {
							if(account!=null && account.isState()==true) {
								System.out.println(account.getName() + "\t\t" +"正常");
							} else if(account!=null && account.isState()==false) {
								System.out.println(account.getName() + "\t\t" +"异常");
							}  
						}
					} else if(option1.equals("2")) {
						System.out.println("请输入要冻结账户");
						String name = input.next();
						boolean flag = true;
						for (int i = 0; i < accounts.length; i++) {
							if (accounts[i]!=null && accounts[i].getName().equals(name)) {
								Account account = new Account();
								account = accounts[i];
								account.setState(false);
								System.out.println("冻结成功");
								flag = false;
								break;
							}
						}
						if(flag) {
							System.out.println("此账户不存在");
						}
						
					} else if(option1.equals("3")) {
						System.out.println("请输入要解冻账户");
						String name = input.next();
						boolean flag = true;
						for (int i = 0; i < accounts.length; i++) {
							if (accounts[i]!=null && accounts[i].getName().equals(name)) {
								Account account = new Account();
								account = accounts[i];
								account.setState(true);
								System.out.println("解结成功");
								flag = false;
								break;
							}
						}
						if(flag) {
							System.out.println("此账户不存在");
						}
						
					} else if(option1.equals("4")) {
						break;
					} else{
						System.out.println("选项输入错误，请重新输入");
					}
				}
			} else {
				System.out.println("密码输入错误");
			}
		} else if (option.equals("4")) {
			System.exit(0);
		} else {
			System.out.println("选项输入错误，请重新输入");
		}
		startup();

	}
}
