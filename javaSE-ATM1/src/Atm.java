
public class Atm {

	java.util.Scanner input = new java.util.Scanner(System.in);
	Bank bank = new Bank();
	Account account = new Account();
	
	public void startup() {
		System.out.println("1.开户");
		System.out.println("2.插卡");
		System.out.println("3.系统管理");
		System.out.println("4.退出");
		System.out.println("请输入选项");
		
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
			System.out.println("选项输入错误");
			break;
		}
		startup();
	}
	private void CreatAccount() {
		System.out.println("请输入账户");
		String name = input.next();
		Account account =  bank.findbyname(name);
		if(account==null) {
			System.out.println("请输入密码");
			String password = input.next();
			System.out.println(bank.savename(name, password)?"开户成功":"开户失败，请联系管理员");
		} else {
			System.out.println("用户名已被占用");
		}
		
	}
	private void insertcard() {
		System.out.println("请输入账户");
		String name = input.next();
		System.out.println("请输入密码");
		String password = input.next();
		account = bank.namematchpassword(name, password);
		if(account!=null) {
			if(account.isState()) {
				System.out.println("登录成功");
				showcardmenu();
			} else{
				System.out.println("账户被冻结，请联系管理员");
			}
		} else {
			System.out.println("账户或密码输入错误");
		}
		startup();
	}
	private void showcardmenu() {
		System.out.println("1.查询余额");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.转账");
		System.out.println("5.修改密码");
		System.out.println("6.退出");
		System.out.println("请输入选项");
		
		switch (input.nextInt()) {
		case 1:
			System.out.println(account.getMoney());
			break;
		case 2:
			System.out.println("请输入存款额");
			int money1 = input.nextInt();
			if(money1 < 0 ) {
				System.out.println("金额输入错误");
			} else {
			account.setMoney(account.getMoney()+money1);
			System.out.println("存款成功，返回上级菜单");}
			break;
		case 3:
			System.out.println("请输入取款额");
			int money2 = input.nextInt();
			if(money2 < 0 || money2 > account.getMoney()) {
				System.out.println("金额输入错误");
			} else {
			account.setMoney(account.getMoney()-money2);
			System.out.println("取款成功，返回上级菜单");}
			break;
		case 4:
			System.out.println("请输入转账账户");
			String name = input.next();
			if(bank.findbyname(name)!=null) {
				System.out.println("请输入转账金额");
				int money3 = input.nextInt();
				if(money3 < 0 || money3 > account.getMoney()) {
					System.out.println("金额输入错误");
				} else {
				Account account2 = bank.findbyname(name);
				account.setMoney(account.getMoney()-money3);
				account2.setMoney(account2.getMoney()+money3);
				System.out.println("转账成功");}
			} else {
				System.out.println("所要转账账户不存在");
			}
			break;
		case 5:
			System.out.println("请输入原始密码");
			String password = input.next();
			if(account.getPassword().equals(password)) {
				System.out.println("请输入新密码");
				String newpassword = input.next();
				account.setPassword(newpassword);
			} else {
				System.out.println("密码输入错误");
			}
			break;
		case 6:
			startup();
			break;
		default:
			System.out.println("选项输入错误");
			break;
		}
		showcardmenu();
	}
	private void systemmanage() {
		System.out.println("请输入管理员密码");
		String manageword = input.next();
		if(manageword.equals("123456")) {
			System.out.println("登录成功");
			showmanagemenu();
		} else {
			System.out.println("密码输入错误");
			startup();
		}
	}
	private void showmanagemenu() {
		System.out.println("1.显示账户");
		System.out.println("2.冻结账户");
		System.out.println("3.解冻账户");
		System.out.println("4.退出");
		System.out.println("请输入选项");
		
		switch (input.nextInt()) {
		case 1:
			Account[] accounts = bank.getAccounts();
			for(int i = 0; i < accounts.length; i++) {
				if(accounts[i]!=null) {
					System.out.println(accounts[i].getName()+"\t"+(accounts[i].isState()?"正常":"异常"));
				}
			}
			//bank.showaccount();
			break;
		case 2:
			System.out.println("请输入要冻结账户");
			String name = input.next();
			if(bank.findbyname(name)!=null) {
				Account account = bank.findbyname(name);
				account.setState(false);
				System.out.println("冻结成功");
			} else {
				System.out.println("此账户不存在");
			}
			break;
		case 3:
			System.out.println("请输入要解冻账户");
			String name1 = input.next();
			if(bank.findbyname(name1)!=null) {
				Account account1 = bank.findbyname(name1);
				account1.setState(true);
				System.out.println("解冻成功");
			} else {
				System.out.println("此账户不存在");
			}
			break;
		case 4:
			startup();
			break;
		default:
			System.out.println("选项输入错误");
			break;
		}
		showmanagemenu();
	}
	
	
	
	
}
