package kaoshi;

public class Child {

	public void study(Kemu kemu) {
		System.out.println("i am studying");
	}
	
	public Kemu teach() {
		return new Shuxue();
	}
}
