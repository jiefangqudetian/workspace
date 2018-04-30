package ever;

public class three {

	public static void main(String[] args) {
		

		java.util.Scanner input =new java.util.Scanner(System.in);
		
		
		String lastname = "";
		int i = 0;
		while(true) {
			System.out.println("ÇëÊäÈëÕËºÅ");
			String name = input.next();
			System.out.println("ÇëÊäÈëÃÜÂë");
			String password = input.next();
			
			if(name.equals("tom") && password.equals("123")) {
				System.out.println("µÇÂ¼³É¹¦");
				break;
			} else {
				System.out.println("ÕËºÅ»òÃÜÂëÊäÈë´íÎó");
				if(name.equals(lastname)) {
					i++;
				}else {
					lastname = name;
					i = 0;
					i++;
				}
			}
			if( i == 3) {
				System.out.println("ÕËºÅÃÜÂë´íÎóÈı´Î£¬ÕËºÅ±»¶³½á");
				break;
			}
		}
		input.close();
	}

}
