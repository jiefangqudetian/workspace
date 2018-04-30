
public class PC {

	java.util.Scanner input = new java.util.Scanner(System.in);
	String names[] = new String[5];
	String nums[] = new String[5];
	
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
		
		for(int i = 0; i < names.length ;i++){
			if(names[i]==null){
				System.out.println("请输入号码");
				String num = input.next();
				names[i]=name;
				nums[i]=num;
				break;
			}
			if(i==names.length-1){
				System.out.println("存储已满");
			}
		}
	}

	public void find() {
		System.out.println("请输入姓名");
		String name = input.next();
		boolean flag = false;
		//String number = null;
		int i;
		for( i = 0 ;i < nums.length ;i++){
			if(names[i]!=null&&names[i].equals(name)){
				 //number = nums[i];
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println(name+"的号码为"+nums[i]);
		}else{
			System.out.println("查无此人");
		}
		
	}

}
