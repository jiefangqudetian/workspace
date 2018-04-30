package ever;

public class three1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		int i = 0;
		String lastname = "tom";
		while (true) {
			System.out.println("请输入账号");
			String name = input.next();
			System.out.println("请输入密码");
			String password = input.next();
			if(name.equals("tom") && password.equals("123")) {
				System.out.println("登录成功");
			} else {
				System.out.println("登录失败");
				if(name.equals(lastname)){
					i++;
				} else {
					lastname = name;
					i = 0;
					i++;
				}
			}
			if(i == 3) {
				System.out.println("连续三次输入错误，账户已被冻结");
			}
			input.close();
		}
	}

}
