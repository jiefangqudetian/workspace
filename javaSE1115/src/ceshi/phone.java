package ceshi;

public class phone {

	java.util.Scanner input = new java.util.Scanner(System.in);
	person[] persons = new person[10];
	
	public void startup() {
		System.out.println("1.保存");
		System.out.println("2.查找");
		System.out.println("3.退出");
		System.out.println("请选择");
		String option = input.next();
		if(option.equals("1")) {
			save();
		} else if(option.equals("2")) {
			find();
		} else if(option.equals("3")) {
			System.exit(0);
		} else{
			System.out.println("选项输入错误，请重新输入");
		}
		startup();
	}
	
	public void find () {
		System.out.println("请输入姓名");
		String name = input.next();
		boolean flag = false;
		for(int i = 0; i < persons.length; i++ ){
			if(persons[i]!=null && persons[i].getName().equals(name)){
				System.out.println("电话号码为"+persons[i].getNum());
				flag = true;
			}
		}
		if(flag==false){
			System.out.println("查无此人");
		}
	}
	
	public void save() {
		System.out.println("请输入姓名");
		String name = input.next();
		boolean flag = false;
		boolean flagi = false;
		for(int i = 0; i < persons.length; i++ ){
			if(persons[i]!=null && persons[i].getName().equals(name)){
				System.out.println("联系人已存在");
				flag = true;
			}
		}
		if(flag==false){
			for(int i = 0; i < persons.length; i++ ){
				if(persons[i]==null){
					System.out.println("请输入电话");
					String num = input.next();
					persons[i] = new person();
					persons[i].setName(name);
					persons[i].setNum(num);
					System.out.println("保存成功");
					flagi = false;
					break;
				} 
			}
		}
		if(flagi) {
			System.out.println("通讯录已满，请联系管理员");
		}
		
	}
	
	
}
