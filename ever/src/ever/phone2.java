package ever;
//存在问题：账号重复会导致检索号码出现问题
public class phone2 {

	java.util.Scanner input = new java.util.Scanner(System.in);
	person[] persons = new person[3];
	
	public void startup() {
		System.out.println("1.保存");
		System.out.println("2.查找");
		System.out.println("3.退出");
		
		String choice = input.next();
		if(choice.equals("1")) {
			save();
		}else if(choice.equals("2")) {
			find();
		}else if(choice.equals("3")) {
			System.exit(0);
		}else {
			System.out.println("选项输入错误");
		}
		startup();
	}
	
	public void save() {
		
		boolean flag = true;
		for(int i = 0; i < persons.length; i++) {
			if(persons[i]==null) {
				flag = false;
				break;
			}  
		}
		if(flag) {
		System.out.println("内存已满，无法保存");
		startup();
		}
		for(int i = 0; i < persons.length; i++) {
			if(persons[i]==null ) {
				
				System.out.println("请输入姓名");
				String name = input.next();
				System.out.println("请输入电话");
				String num = input.next();
				System.out.println("请输入qq");
				String qq = input.next();
				
				person per = new person();
				per.setName(name);
				per.setNum(num);
				per.setQq(qq);
				persons[i] = per;
				System.out.println("保存成功");
				break;
			}
		}
	}
	
	public void find() {
		System.out.println("请输入姓名");
		String name = input.next();
		boolean flag = true;
		/*for(int i = 0; i < person.length; i++){
			if(person[i]!=null && person[i].getName().equals(name)) {
				System.out.println("查找号码为"+person[i].getNum());
				System.out.println("查找qq为"+person[i].getQq());
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("查无此人");
		}*/
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i]==null) {
				break;
			}else if(persons[i].getName().equals(name)) {
				System.out.println("查找号码为"+persons[i].getNum());
				System.out.println("查找qq为"+persons[i].getQq());
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("查无此人");
		}
		
	}
	
	
	
}
