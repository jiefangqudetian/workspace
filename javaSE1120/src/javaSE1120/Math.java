package javaSE1120;

public class Math {

	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
//	public int add(int[] a) {
//		int sum = 0;
//		for(int c:a) {
//			sum = sum +c;
//		}
//		return sum;
//	}
	
	public int add(int... a) {
		int sum = 0;
		for(int i:a) {
			sum = sum + i;
		}
		return sum;
	}
	
	
	
}
