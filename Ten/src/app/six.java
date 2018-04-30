package app;

public class six {

	public static void main(String[] args) {
		
		int[] num = {99, 56 , 65 ,75 ,85 ,97 , 100};
		for(int i=0; i < num.length-1; i++){
			for(int j=0; j < num.length-1-i ; j++){
				if(num[j]<num[j+1]){
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
			
		}
		for(int a=0;a<num.length;a++){
			System.out.println(num[a]);
		}
		// TODO Auto-generated method stub

	}

}
