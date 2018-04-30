package ever;


public class paixu {

	/** ц╟ещеепР
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,5,2,6,3};
		for(int i = 0; i < num.length-1; i++){
			for(int j = 0; j < num.length-1-i; j++){
				if(num[j] > num[j+1]) {
					int max = num[j];
					num[j] = num[j+1];
					num[j+1] = max;
					
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		//15236 15263 12563 12536
		//12536 12536 12356
		//12356 12356
		//12356
		
		
		
	}

}
