package ceshi;


public class Teset {

	public static void main(String[] args) {

		int[] num = { 8, 9, 3, 4, 5 };
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = 0;
					temp = num[i];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}

		}
		/*String[] b = new String[3];
		b[0]="123";
		b[1]="456";
		b[2]="789";
		for (String a : b) {
			
			System.out.println(a);
		}*/
		for (int a : num) {
			
			System.out.println(a);
		}

	}
}
