
public class Account {

	public String name;
	public String password;
	public int money;
	public boolean state = true;
	
	public Account(String name,String password) {
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", state=" + (state?"Õý³£":"Òì³£") + "]";
	}
	
	
	
	
}
