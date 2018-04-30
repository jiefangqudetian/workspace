
public class Atm {

	Account account = new Account();
	Bank bank = new Bank();
	java.util.Scanner input = new java.util.Scanner(System.in);
	public void startup() {
		System.out.println("1.开户");
		System.out.println("2.插卡");
		System.out.println("3.系统管理");
		System.out.println("4.退出");
		System.out.println("请输入选项");
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
			System.out.println("选项输入有误，请重新输入");
			break;
		}
		startup();
	}
	private void insertcard() {
		// TODO Auto-generated method stub
		System.out.println("请输入账户");
		String name = input.next();
		System.out.println("请输入密码");
		String password = input.next();
	    account = new Account();
		account=bank.findbynameandpassword(name, password);
		if(account!=null) {
			if(account.isState()) {
				System.out.println("登录成功");
				showcardmenu();
			} else {
				System.out.println("账户被冻结，请联系管理员");
			}
		} else {
			System.out.println("账户或密码输入错误");
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
		System.out.println("1.显示账户");
		System.out.println("2.冻结账户");
		System.out.println("3.解冻账户");
		System.out.println("4.退出");
		System.out.println("请输入选项");
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
			System.out.println("选项输入错误，请重新输入");
			break;
		}
		showmanagemenu();
	}
	private void recoveraccount() {
		// TODO Auto-generated method stub
		System.out.println("请输入要解冻账户");
		String name = input.next();
		Account account2 = bank.findbyname(name);
		if(account2!=null) {
			account2.setState(true);
		} else {
			System.out.println("此账户不存在");
		}
		
	}
	private void frozenaccount() {
		// TODO Auto-generated method stub
		System.out.println("请输入要冻结账户");
		String name = input.next();
		Account account2 = bank.findbyname(name);
		if(account2!=null) {
			account2.setState(false);
		} else {
			System.out.println("此账户不存在");
		}
	}
	private void showallaccount() {
		// TODO Auto-generated method stub
		Account[] accounts = bank.getAccounts();
		for(int i = 0; i < accounts.length; i++) {
			if (accounts[i]!=null) {
				System.out.println(accounts[i].getName()+"\t\t"+(accounts[i].isState()?"正常":"异常"));
			}
		}
	}
	private void showcardmenu() {
		// TODO Auto-generated method stub
		System.out.println("1.显示余额");
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
			tranmoney();
			break;
		case 5:
			fixpassword();
			break;
		case 6:
			startup();
			break;
		default:
			System.out.println("输入有误，请重新输入");
			break;
		}
		showcardmenu();
	}
	
	private void fixpassword() {
		// TODO Auto-generated method stub
		System.out.println("请输入原密码");
		String password = input.next();
		if(account.getPassword().equals(password)) {
			account.setPassword(password);
			System.out.println("密码输入成功");
		} else {
			System.out.println("密码输入错误");
		}
	}
	private void tranmoney() {
		// TODO Auto-generated method stub
		System.out.println("请输入转账账户");
		String name = input.next();
		Account account2 = bank.findbyname(name);
		if(account2!=null) {
			System.out.println("请输入转账金额");
			int money = input.nextInt();
			if(money < 0 || money > account.getMoney()) {
				System.out.println("金额输入有误");
			} else {
				account.setMoney(account.getMoney() - money);
				account2.setMoney(account2.getMoney() + money);
			}
		} else {
			System.out.println("此账户不存在");
		}
	}
	private void outmoney() {
		// TODO Auto-generated method stub
		System.out.println("请输入取款金额");
		int money = input.nextInt();
		if(money < 0 || money > account.getMoney()) {
			System.out.println("金额输入错误，请重新输入");
			inmoney();
		} else {
			account.setMoney(account.getMoney() - money);
			System.out.println("取款成功");
		}
		
	}
	private void inmoney() {
		// TODO Auto-generated method stub
		System.out.println("请输入存款金额");
		int money = input.nextInt();
		if(money > 0) {
			account.setMoney(account.getMoney() + money);
			System.out.println("存款成功");
		} else {
			System.out.println("金额输入错误，请重新输入");
			inmoney();
		}
	}
	private void showmoney() {
		// TODO Auto-generated method stub
		System.out.println(account.getMoney());
	}
	private void createaccount() {
		// TODO Auto-generated method stub
		System.out.println("请输入账户");
		String name = input.next();
		if(bank.findbyname(name)==null) {
			System.out.println("请输入密码");
			String password = input.next();
			if(bank.savename(name, password)) {
				System.out.println("开户成功");
			} else {
				System.out.println("开户失败，请联系管理员");
			}
		} else {
			System.out.println("用户名已占用");
		}
		
	}
}
