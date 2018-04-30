import java.util.ArrayList;
import java.util.List;

public class Bank {

	private Bank(){}
	private Bank bank = new Bank() ;
	public  Bank getInstance() {
		return bank;
	}
	
	public List<Account> acclist = new ArrayList<>();
	
	public Account findbyname(String name){
		for(Account account : acclist) {
			if(account.getName().equals(name)) {
				return account;
			}
		}
		return null;
	}
}
