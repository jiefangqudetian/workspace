
public class Atm {

	private java.util.Scanner input = new java.util.Scanner(System.in);
	private Bank bank = new Bank();
	private Account account = null;
	public void startup() {
		System.out.println("1.开户");
		System.out.println("2.插卡");
		System.out.println("3.系统管理");
		System.out.println("4.退出");
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
			System.out.println("输入有误，请重新输入");
		}
		startup();
	}

	private void systemmange() {
		// TODO Auto-generated method stub
		System.out.println("请输入管理员密码");
		String word = input.next();
		if(word.equals("123456")) {
			System.out.println("登录成功");
			showmangemenu();
		} else {
			System.out.println("密码输入错误");
		}
	}

	private void showmangemenu() {
		// TODO Auto-generated method stub
		System.out.println("1.显示所有用户");
		System.out.println("2.冻结账户");
		System.out.println("3.恢复账户");
		System.out.println("4.退出");
		System.out.println("请选择");
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
		System.out.println("请输入要恢复账户");
		String name = input.next();
		if(bank.findbyname(name)!=null) {
			bank.recoverAccounts(bank.findbyname(name));
		} else {
			System.out.println("该账户不存在，请重新输入");
			recover();
		}
	}

	private void frozen() {
		// TODO Auto-generated method stub
		bank.ShowAccountsEnable();
		System.out.println("请输入要冻结账户");
		String name = input.next();
		if(bank.findbyname(name)!=null) {
			bank.frozenAccounts(bank.findbyname(name));
		} else {
			System.out.println("该账户不存在，请重新输入");
			frozen();
		}
	}


	private void creataccount() {
		/*if(bank.jiance()) {
			System.out.println("账户已满，无法开户");
			startup();
		}*/
		System.out.println("请输入账号");
		String name = input.next();
		if(bank.findbyname(name)!=null) {
			System.out.println("用户名已被占用");
			creataccount();
		}else {
			System.out.println("请输入密码");
			String password = input.next();
			bank.savename(name,password);
			startup();
		}
	}
	
	private void insertcard() {
		
		System.out.println("请输入账户");
		String name = input.next();
		System.out.println("请输入密码");
		String password = input.next();
		
		account = bank.findbynameandpassword(name, password);          //如果找到amount[i],把其赋值给amount
		
		if(account==null) {                                            //               账号密码错误 
			System.out.println("账户或密码输入错误");
			insertcard();
		} else if(account.isEnable()) {                                //登录成功
			System.out.println("登录成功");
			showcardmenu();
		} else {
			System.out.println("账户冻结");
		}
			
		
	}

	private void showcardmenu() {
		// TODO Auto-generated method stub
		System.out.println("1.查询余额");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.转账");
		System.out.println("5.修改密码");
		System.out.println("6.退出");
		
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
		System.out.println("请输入存款额");
		int money = input.nextInt();
		if(money < 0) {
			System.out.println("格式输入错误，返回上一级");
			showcardmenu();
		} else {
			account.setMoney(account.getMoney()+money);
			System.out.println("存款成功");
			showcardmenu();
		}
	}
	
	private void drawmoney() {
		// TODO Auto-generated method stub
		System.out.println("请输入取款额");
		int money = input.nextInt();
		if(money<0 || money>account.getMoney()) {
			System.out.println("格式输入错误，返回上一级");
		} else {
			account.setMoney(account.getMoney()-money);
			System.out.println("取款成功");
			showcardmenu();
		}
	}
	
	private void fixpassword() {
		// TODO Auto-generated method stub
		System.out.println("请输入原始密码");
		String word = input.next();
		
		if(word.equals(account.getPassword())) {
			System.out.println("请输入新密码");
			account.setPassword(input.next());
			System.out.println("修改密码成功");
			showcardmenu();
		} else {
			System.out.println("原始密码输入错误，返回上一级");
			showcardmenu();
		}
	}

	private void tranmoney() {
		// TODO Auto-generated method stub
		System.out.println("请输入转账账号");
		String name = input.next();
		Account inAccount = null;
		inAccount=bank.findbyname(name);
		if(inAccount!=null) {
			System.out.println("请输入金额");
			int money = input.nextInt();
			if(money > account.getMoney() || money < 0) {
				System.out.println("金额输入错误，返回上一级");
				showcardmenu();
			} else {
				System.out.println("转账成功");
				account.setMoney(account.getMoney()-money);
				inAccount.setMoney(inAccount.getMoney()+money);
				showcardmenu();
			}
			
			
		} else {
			System.out.println("输入账户不存在，返回上一级");
			showcardmenu();
		}
	}

	

	

	
	
}
