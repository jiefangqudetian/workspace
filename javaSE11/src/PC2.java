
public class PC2 {

	java.util.Scanner input = new java.util.Scanner(System.in);
	
	Person[] person = new Person[5];
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
		
		for(int i = 0; i < person.length ;i++){
			if(person[i]==null){
				System.out.println("���������");
				String num = input.next();
				System.out.println("������QQ");
				String qq = input.next();
				System.out.println("������΢��");
				String weixin = input.next();
				System.out.println("�������ַ");
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
				System.out.println("�洢����");
			}
		}
	}

	public void find() {
		System.out.println("����������");
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
			System.out.println("���ҵĺ���Ϊ"+person[i].getNum());
			System.out.println("���ҵ�qqΪ"+person[i].getQq());
			System.out.println("���ҵ�΢��Ϊ"+person[i].getWeixin());
			System.out.println("���ҵĵ�ַΪ"+person[i].getAddress());
		}else{
			System.out.println("���޴���");
		}
		
	}

	
}
