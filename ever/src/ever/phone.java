package ever;


public class phone {

	java.util.Scanner input = new java.util.Scanner(System.in);
	person[] persons = new person[10];
	
	public void startup() {
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.�˳�");
		
		String choice = input.next();
		if(choice.equals("1")) {
			save();
		}else if(choice.equals("2")) {
			find();
		}else if(choice.equals("3")) {
			System.exit(0);
		}else {
			System.out.println("ѡ���������");
		}
		startup();
	}
	
	public void save() {
		System.out.println("����������");
		String name = input.next();
		boolean flag = false;
		for(int i = 0; i < persons.length; i++) {
			if(persons[i]==null ) {
				person per = new person();
				
				System.out.println("������绰");
				String num = input.next();
				System.out.println("������qq");
				String qq = input.next();
				per.setName(name);
				per.setNum(num);
				per.setQq(qq);
				persons[i] = per;
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("����ɹ�");
		}else{
			System.out.println("�ڴ�����");
		}
		
		
	}
	
	public void find() {
		System.out.println("����������");
		String name = input.next();
		boolean flag = true;
		/*for(int i = 0; i < person.length; i++){
			if(person[i]!=null && person[i].getName().equals(name)) {
				System.out.println("���Һ���Ϊ"+person[i].getNum());
				System.out.println("����qqΪ"+person[i].getQq());
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("���޴���");
		}*/
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i]==null) {
				break;
			}else if(persons[i].getName().equals(name)) {
				System.out.println("���Һ���Ϊ"+persons[i].getNum());
				System.out.println("����qqΪ"+persons[i].getQq());
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("���޴���");
		}
		
	}
	
}

