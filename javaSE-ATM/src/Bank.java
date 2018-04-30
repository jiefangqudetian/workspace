
public class Bank {

	Account[] accounts = new Account[100];
	
	public Account findbyname(String name) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null && accounts[i].getName().equals(name)) {
				return accounts[i];
			}
		}
	
		return null;
	}
	
	public void savename(String name,String password) {
		int i = 0;
		for( i = 0; i < accounts.length; i++) {
			if(accounts[i]==null) {
				Account account = new Account();
				account.setName(name);
				account.setPassword(password);
				accounts[i] = account;
				System.out.println("保存成功");
				break;
			}
		}
		if(i == accounts.length) {
			System.out.println("内存已满");
		}
	}
	
	public Account findbynameandpassword(String name,String password) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null && accounts[i].getName().equals(name) && accounts[i].getPassword().equals(password)) {
				return accounts[i];
			}
		}
		
		return null;
	}
	
	
	public void ShowAccountsEnable() {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null) {
				System.out.println(accounts[i].getName()+"\t\t"+(accounts[i].isEnable()?"正常":"冻结"));
			}
		}
	}

	

	public void frozenAccounts(Account account) {
		account.setEnable(false);
	}
	
	public void recoverAccounts(Account account) {
		account.setEnable(true);
	}
	
}
