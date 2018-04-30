public class Contacts {
	
	public String number(String name) {
		java.util.Random random = new java.util.Random();
		int[] num = new int[11];
		for(int i=0;i<num.length;i++){
			if(i==0){
				System.out.print(1);
			}else if(i==1){
				System.out.print(3);
			}else{
				System.out.print(random.nextInt(9));
			}
			
		}
		
		
		String result = "15738518183";
		return result;
	}
	
	
}