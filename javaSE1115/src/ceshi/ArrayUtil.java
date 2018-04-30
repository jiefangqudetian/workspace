package ceshi;

public class ArrayUtil {

	public int max(int[] num) {
		for(int i = 0; i < num.length-1; i++) {
			if(num[i] > num[i+1]) {
				int temp = 0;
				temp = num[i];
				num[i] = num[i+1];
				num[i+1] = temp;
			}
		}
		return num[num.length-1];
	}
	
}
