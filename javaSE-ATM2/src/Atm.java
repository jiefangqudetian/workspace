
public class Atm {
	Bank bank = new Bank();
	java.util.Scanner input = new java.util.Scanner(System.in);
	Account account;
	public void startup() {
		System.out.println("1.开户");
		System.out.println("2.插卡");
		System.out.println("3.系统管理");
		System.out.println("4.退出");
		System.out.println("请输入选项");
		
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
		System.out.println("请输入账户");
		String name = input.next();
		if(bank.findbyname(name)!=null) {
			System.out.println("用户名已存在，请重新输入");
			createaccounts();
		} else {
			System.out.println("请输入密码");
			String password = input.next();
			Account account = new Account();
			account.setName(name);
			account.setPassword(password);
			if(bank.savename(account)) {
				System.out.println("开户成功");
			} else {
				System.out.println("开户失败，请联系管理员");
			}
		}
	}
	
	private void insertcard() {
		// TODO Auto-generated method stub
		System.out.println("请输入用户名");
		String name = input.next();
		System.out.println("请输入密码");
		String password = input.next();
		account = bank.findbynameandpassword(name, password);
		if(account!=null) {
			if(account.isState()) {
				System.out.println("登录成功");
				showcardmenu();
			} else {
				System.out.println("账户被冻结");
			}
			showcardmenu();
		} else {
			System.out.println("账户或密码输入错误");
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
		System.out.println("请输入选项");
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
			System.out.println("选项输入错误，请重新输入");
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
		System.out.println("请输入存款金额");
		int money = input.nextInt();
		if(money > 0) {
			System.out.println("存款成功");
			account.setMoney(account.getMoney()+money);
		} else {
			System.out.println("金额输入错误");
		}
	}
	private void outmoney() {
		// TODO Auto-generated method stub
		System.out.println("请输入取款金额");
		int money = input.nextInt();
		if(money < 0 || money > account.getMoney()) {
			System.out.println("金额输入错误");
		} else {
			account.setMoney(account.getMoney()-money);
			System.out.println("取款成功");
		}
		
	}
	private void changemoney() {
		// TODO Auto-generated method stub
		System.out.println("请输入转账账户");
		String name = input.next();
		Account account1 = bank.findbyname(name);
		if(account1!=null) {
			System.out.println("请输入转账金额");
			int money = input.nextInt();
			if(money < 0 || money > account.getMoney()) {
				System.out.println("金额输入错误");
			} else {
				account.setMoney(account.getMoney()-money);
				account1.setMoney(account1.getMoney()+money);
				System.out.println("转账成功");
			}
		} else {
			System.out.println("账户不存在");
		}
	}
	
	private void changepassword() {
		// TODO Auto-generated method stub
		System.out.println("请输入原始密码");
		String password = input.next();
		if(account.getPassword().equals(password)) {
			System.out.println("请输入新密码");
			String newpassword = input.next();
			System.out.println("密码修改成功");
			account.setPassword(newpassword);
		} else {
			System.out.println("原始密码输入错误");
		}
	}
	
	private void systemmanage() {
		// TODO Auto-generated method stub
		System.out.println("请输入管理员密码");
		String password = input.next();
		if(password.equals("123456")) {
			showmanagemenu();
		} else {
			System.out.println("密码输入错误");
		}
	}
	private void showmanagemenu() {
		// TODO Auto-generated method stub
		System.out.println("1.显示所有用户状态");
		System.out.println("2.冻结账户");
		System.out.println("3.解冻账户");
		System.out.println("4.退出");
		System.out.println("请输入选项");
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
			System.out.println("输入有误，请重新输入");
			break;
		}
		showmanagemenu();
	}
	private void recoveraccount() {
		// TODO Auto-generated method stub
		System.out.println("请输入要解冻账户");
		String name = input.next();
		Account account = bank.findbyname(name);
		if(account==null) {
			System.out.println("此账户不存在");
		} else {
			account.setState(true);
		}
		
	}
	private void frozenaccount() {
		// TODO Auto-generated method stub
		System.out.println("请输入要冻结账户");
		String name = input.next();
		Account account = bank.findbyname(name);
		if(account==null) {
			System.out.println("此账户不存在");
		} else {
			account.setState(false);
		}
	}
	private void showaccountstate() {
		// TODO Auto-generated method stub
		Account[] accounts = bank.getAccounts();
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null) {
				System.out.println(accounts[i].getName()+"\t\t"+(accounts[i].isState()?"正常":"异常"));
			}
		}
	}

}
