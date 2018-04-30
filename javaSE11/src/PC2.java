
public class PC2 {

	java.util.Scanner input = new java.util.Scanner(System.in);
	
	Person[] person = new Person[5];
	public void startup() {
		System.out.println("1.保存");
		System.out.println("2.查找");
		System.out.println("3.退出");
		System.out.println("请输入选项");
		String choice = input.next();
		if (choice.equals("1")) {
			save();
		} else if (choice.equals("2")) {
			find();
		} else if (choice.equals("3")) {
			System.exit(0);
		} else {
			System.out.println("选项输入有误，重新输入");
		
		}
		startup();
	}

	public void save() {
		System.out.println("请输入姓名");
		String name = input.next();
		
		for(int i = 0; i < person.length ;i++){
			if(person[i]==null){
				System.out.println("请输入号码");
				String num = input.next();
				System.out.println("请输入QQ");
				String qq = input.next();
				System.out.println("请输入微信");
				String weixin = input.next();
				System.out.println("请输入地址");
				String address = input.next();
				Person persons = new Person();
				persons.setName(name);
				persons.setNum(num);
				persons.setQq(qq);
				persons.setWeixin(weixin);
				persons.setAddress(address);
				person[i]=persons;
				break;
			}
			if(i==person.length-1){
				System.out.println("存储已满");
			}
		}
	}

	public void find() {
		System.out.println("请输入姓名");
		String name = input.next();
		boolean flag = false;
		int i;
		for( i = 0 ;i < person.length ;i++){
			if(person[i]!=null&&person[i].getName()!=null&&person[i].getName().equals(name)){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("查找的号码为"+person[i].getNum());
			System.out.println("查找的qq为"+person[i].getQq());
			System.out.println("查找的微信为"+person[i].getWeixin());
			System.out.println("查找的地址为"+person[i].getAddress());
		}else{
			System.out.println("查无此人");
		}
		
	}

	
}
