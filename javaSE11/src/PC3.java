

public class PC3 {
	java.util.Scanner input = new java.util.Scanner(System.in);
	Person[] persons = new Person[10];
	public void startup() {
		
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.�˳�");
		System.out.println("������ѡ��");
		
		String option = input.next();
		if(option.equals("1")) {
			save();
		}else if(option.equals("2")) {
			find();
		}else if(option.equals("3")) {
			System.exit(0);
		}else{
			System.out.println("ѡ��������������������");
		}
		startup();
	}
	
	public void save() {
		boolean flag = false;
		Person person = new Person();
		System.out.println("����������");
		person.setName(input.next());
		for(int i = 0; i < persons.length; i++) {
			if(persons[i]==null) {
				
				System.out.println("������绰");
				person.setNum(input.next()); 
				System.out.println("������qq");
				person.setQq(input.next());
				System.out.println("������΢��");
				person.setWeixin(input.next());
				System.out.println("�������ַ");
				person.setAddress(input.next());
				persons[i]=person;
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("����ɹ���������һ���˵�");
		}else {System.out.println("�ڴ�����");}
	}
	public void find() {
		boolean flag = true;
		System.out.println("������Ҫ��������");
		String name = input.next();
		for(int i = 0; i < persons.length; i++) { 
			if(persons[i]!=null && name.equals(persons[i].getName())) {
				System.out.println("�绰Ϊ"+persons[i].getNum());
				System.out.println("qqΪ"+persons[i].getQq());
				System.out.println("΢��Ϊ"+persons[i].getWeixin());
				System.out.println("��ַΪ"+persons[i].getAddress());
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("���޴���");
		}
		
	}
}
