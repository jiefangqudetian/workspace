package ceshi;

public class phone {

	java.util.Scanner input = new java.util.Scanner(System.in);
	person[] persons = new person[10];
	
	public void startup() {
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.�˳�");
		System.out.println("��ѡ��");
		String option = input.next();
		if(option.equals("1")) {
			save();
		} else if(option.equals("2")) {
			find();
		} else if(option.equals("3")) {
			System.exit(0);
		} else{
			System.out.println("ѡ�������������������");
		}
		startup();
	}
	
	public void find () {
		System.out.println("����������");
		String name = input.next();
		boolean flag = false;
		for(int i = 0; i < persons.length; i++ ){
			if(persons[i]!=null && persons[i].getName().equals(name)){
				System.out.println("�绰����Ϊ"+persons[i].getNum());
				flag = true;
			}
		}
		if(flag==false){
			System.out.println("���޴���");
		}
	}
	
	public void save() {
		System.out.println("����������");
		String name = input.next();
		boolean flag = false;
		boolean flagi = false;
		for(int i = 0; i < persons.length; i++ ){
			if(persons[i]!=null && persons[i].getName().equals(name)){
				System.out.println("��ϵ���Ѵ���");
				flag = true;
			}
		}
		if(flag==false){
			for(int i = 0; i < persons.length; i++ ){
				if(persons[i]==null){
					System.out.println("������绰");
					String num = input.next();
					persons[i] = new person();
					persons[i].setName(name);
					persons[i].setNum(num);
					System.out.println("����ɹ�");
					flagi = false;
					break;
				} 
			}
		}
		if(flagi) {
			System.out.println("ͨѶ¼����������ϵ����Ա");
		}
		
	}
	
	
}
