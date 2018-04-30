

public class PC3 {
	java.util.Scanner input = new java.util.Scanner(System.in);
	Person[] persons = new Person[10];
	public void startup() {
		
		System.out.println("1.保存");
		System.out.println("2.查找");
		System.out.println("3.退出");
		System.out.println("请输入选项");
		
		String option = input.next();
		if(option.equals("1")) {
			save();
		}else if(option.equals("2")) {
			find();
		}else if(option.equals("3")) {
			System.exit(0);
		}else{
			System.out.println("选项输入有误，请重新输入");
		}
		startup();
	}
	
	public void save() {
		boolean flag = false;
		Person person = new Person();
		System.out.println("请输入姓名");
		person.setName(input.next());
		for(int i = 0; i < persons.length; i++) {
			if(persons[i]==null) {
				
				System.out.println("请输入电话");
				person.setNum(input.next()); 
				System.out.println("请输入qq");
				person.setQq(input.next());
				System.out.println("请输入微信");
				person.setWeixin(input.next());
				System.out.println("请输入地址");
				person.setAddress(input.next());
				persons[i]=person;
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("保存成功，返回上一级菜单");
		}else {System.out.println("内存已满");}
	}
	public void find() {
		boolean flag = true;
		System.out.println("请输入要查找姓名");
		String name = input.next();
		for(int i = 0; i < persons.length; i++) { 
			if(persons[i]!=null && name.equals(persons[i].getName())) {
				System.out.println("电话为"+persons[i].getNum());
				System.out.println("qq为"+persons[i].getQq());
				System.out.println("微信为"+persons[i].getWeixin());
				System.out.println("地址为"+persons[i].getAddress());
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("查无此人");
		}
		
	}
}
