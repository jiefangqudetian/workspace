import java.util.Scanner;
import java.util.Set;

public class Atm {

	Account account = new Account();
	Bank bank = Bank.getInstance();
	Scanner input = new Scanner(System.in);
	public void startup() {
		System.out.println("1.开户");
		System.out.println("2.插卡");
		System.out.println("3.系统管理");
		System.out.println("4.退出");
		System.out.println("请输入选项");
		switch (input.nextInt()) {
		case 1:
			
			System.out.println("请输入账户");
			String name = input.next();
			
			if(bank.maps.containsKey(name)) {
				System.out.println("账户已存在");
			} else {
				System.out.println("请输入密码");
				String password =input.next();
				Account acc = new Account();
				acc.setName(name);
				acc.setPassword(password);
				bank.maps.put(name, acc);
				System.out.println("开户成功");
			}
			break;
		case 2:
			
			System.out.println("请输入账户");
			String name1 = input.next();
			System.out.println("请输入密码");
			String password1 = input.next();
			if(bank.maps.containsKey(name1)){
				account = bank.maps.get(name1);
				
				if(account.getPassword().equals(password1)) {
					System.out.println("登录成功");
					showAccountView();
				}
				
			} else {
				System.out.println("账户或密码输入错误");
			}
			
			
			break;
		case 3:
			
			System.out.println("请输入管理员密码");
			String password2 = input.next();
			if(password2.equals("123456")) {
				showMangageMenu();
			} else {
				System.out.println("密码输入错误");
			}
			break;
		case 4:
			System.exit(0);
			
			break;

		default:
			System.out.println("选项输入错误，请重新输入");
			break;
		}
		startup();
	}
		
	private void showMangageMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.查看账户状态");
		System.out.println("2.冻结账户");
		System.out.println("3.解冻账户");
		System.out.println("4.退出");
		System.out.println("请输入选项");
		int num = input.nextInt();
		switch (num) {
		case 1:
			Set<String> sets = bank.maps.keySet();
			for(String string : sets) {
				Account acc = bank.maps.get(string);
				System.out.println(string + "  "+(acc.isState()?"正常" : "异常"));
			}
			break;
		case 2:
			System.out.println("请输入要冻结账户");
			String named = input.next();
			if(bank.maps.containsKey(named)) {
				Account accd = bank.maps.get(named);
				accd.setState(false);
			} else{
				System.out.println("账户不存在");
			}
			break;
		case 3:
			System.out.println("请输入要解冻账户");
			String namej = input.next();
			if(bank.maps.containsKey(namej)) {
				Account accj = bank.maps.get(namej);
				accj.setState(true);
			} else{
				System.out.println("账户不存在");
			}
			break;
			
		case 4:
			startup();
			break;

		default:
			break;
		}
	}
	
	private void showAccountView() {
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
			if(inmoney<0){
				System.out.println("金额输入错误");
			} else {
				account.setMoney(inmoney+account.getMoney());
				System.out.println("存款成功");
			}
			break;
		case 3:
			System.out.println("请输入取款额");
			int outmoney = input.nextInt();
			if(outmoney<0 || outmoney>account.getMoney()) {
				System.out.println("金额输入错误");
			} else {
				account.setMoney(account.getMoney()-outmoney);
				System.out.println("取款成功");
			}
			break;
		case 4:
			System.out.println("请输入转账账户");
			String name = input.next();
			if(bank.maps.containsKey(name)) {
				Account acc = bank.maps.get(name);
				
				System.out.println("请输入转账额");
				int tranmoney = input.nextInt();
				if(tranmoney<0 || tranmoney>account.getMoney()) {
					System.out.println("金额输入错误");
				} else {
					account.setMoney(account.getMoney()-tranmoney);
					acc.setMoney(acc.getMoney()+tranmoney);
					System.out.println("转账成功");
				}
			} else {
				System.out.println("账户输入错误");
				
			}
			break;
		case 5:
			System.out.println("请输入原始密码");
			String oldpassword = input.next();
			if(account.getPassword().equals(oldpassword)) {
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
			break;
		}
		
		
		showAccountView();
	}
}
