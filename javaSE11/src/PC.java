
public class PC {

	java.util.Scanner input = new java.util.Scanner(System.in);
	String names[] = new String[5];
	String nums[] = new String[5];
	
	public void startup() {
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.�˳�");
		System.out.println("������ѡ��");
		String choice = input.next();
		if (choice.equals("1")) {
			save();
		} else if (choice.equals("2")) {
			find();
		} else if (choice.equals("3")) {
			System.exit(0);
		} else {
			System.out.println("ѡ������������������");
		
		}
		startup();
	}

	public void save() {
		System.out.println("����������");
		String name = input.next();
		
		for(int i = 0; i < names.length ;i++){
			if(names[i]==null){
				System.out.println("���������");
				String num = input.next();
				names[i]=name;
				nums[i]=num;
				break;
			}
			if(i==names.length-1){
				System.out.println("�洢����");
			}
		}
	}

	public void find() {
		System.out.println("����������");
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
			System.out.println(name+"�ĺ���Ϊ"+nums[i]);
		}else{
			System.out.println("���޴���");
		}
		
	}

}
