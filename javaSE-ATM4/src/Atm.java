
public class Atm {


	Account account = new Account();
	Account[] accounts = new Account[10];
	java.util.Scanner input= new java.util.Scanner(System.in);
	
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
		System.out.println("请输入管理员密码");
		String password = input.next();
		if(password.equals("123456")) {
			showmanagemenu();
		} else {
			System.out.println("密码输入错误");
			startup();
		}
	}

	private void showmanagemenu() {
		// TODO Auto-generated method stub
		System.out.println("1.显示所有账户");
		System.out.println("2.冻结账户");
		System.out.println("3.解冻账户");
		System.out.println("4.退出");
		System.out.println("请输入选项");
		switch (input.nextInt()) {
		case 1:
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i]!=null) {
					System.out.println(accounts[i].getName()+"\t\t"+(accounts[i].isState()?"正常":"异常"));
				}
			}
			break;
		case 2:
			System.out.println("请输入要冻结账户");
			String name = input.next();
			if(findbyname(name)!=null) {
				findbyname(name).setState(false);
			} else {
				System.out.println("此账户不存在");
			}
			break;
		case 3:
			System.out.println("请输入要解结账户");
			String name1 = input.next();
			if(findbyname(name1)!=null) {
				findbyname(name1).setState(true);
			} else {
				System.out.println("此账户不存在");
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
		System.out.println("请输入账户名");
		String name = input.next();
		System.out.println("请输入密码");
		String password = input.next();
		if(findbynameandpassword(name, password)!=null) {
			account=findbynameandpassword(name, password);
			System.out.println("登录成功");
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
			System.out.println(account.getMoney());
			break;
		case 2:
			System.out.println("请输入存款额");
			int inmoney = input.nextInt();
			if(inmoney>0) {
				account.setMoney(account.getMoney() + inmoney);
				System.out.println("存款成功");
			} else {
				System.out.println("金额输入错误");
			}
			break;
		case 3:
			System.out.println("请输入取款额");
			int outmoney = input.nextInt();
			if(outmoney<0 || outmoney>account.getMoney()) {
				System.out.println("金额输入错误");
			} else {
				account.setMoney(account.getMoney() - outmoney);
				System.out.println("取款成功");
			}
			break;
		case 4:
			System.out.println("请输入转款账户");
			String zhuanname = input.next();
			if(findbyname(zhuanname)!=null) {
				Account account1 = findbyname(zhuanname);
				System.out.println("请输入转款额");
				int zhuanmoney = input.nextInt();
				if(zhuanmoney<0 || zhuanmoney>account.getMoney()) {
					System.out.println("金额输入错误");
				} else {
					account.setMoney(account.getMoney() - zhuanmoney);
					account1.setMoney(account1.getMoney() + zhuanmoney);
					System.out.println("转账成功");
				}
			} else {
				System.out.println("转款账户不存在");
			}
			break;
		case 5:
			System.out.println("请输入原始密码");
			String password = input.next();
			if(account.getPassword().equals(password)) {
				System.out.println("请输入新密码");
				String newpassword = input.next();
				account.setPassword(newpassword);
				System.out.println("修改密码成功");
			} else {
				System.out.println("原始密码输入错误");
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

	private void createaccount() {
		// TODO Auto-generated method stub
		System.out.println("请输入账户");
		String name = input.next();
		if(findbyname(name)==null) {
			System.out.println("请输入密码");
			String password = input.next();
			System.out.println(savename(name, password)?"开户成功":"开户失败，请联系管理员");
		} else {
			System.out.println("用户名被占用");
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
