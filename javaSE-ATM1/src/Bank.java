
public class Bank {

	public Account[] accounts = new Account[10];

	public Account findbyname(String name) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null && accounts[i].getName().equals(name)) {
				return accounts[i];
			}
		}
		return null;
	}
	
	public boolean savename(String name, String password) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]==null ) {
				accounts[i] = new Account();
				accounts[i].setName(name);
				accounts[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public Account namematchpassword(String name, String password) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null && accounts[i].getName().equals(name) && accounts[i].getPassword().equals(password) ) {
				return accounts[i];
			}
		}
		return null;
	}
	
	
	/*public void showaccount() {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null ) {
				System.out.println(accounts[i].getName() + "\t\t" + (accounts[i].isState()?"Õý³£":"¶³½á"));
			}
		}
	}*/
	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	
	
}
