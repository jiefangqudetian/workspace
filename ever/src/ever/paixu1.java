package ever;

public class paixu1 {

	public static void main(String[] args) {
		int[] nums = {1,3,7,8,2,8,5,0,9,9,6};
		System.out.println("ÅÅĞòÇ°");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j < nums.length-1-i; j++) {
				if(nums[j] > nums[j+1]) {
					nums[j] = nums[j] + nums[j+1];
					nums[j+1] = nums[j] - nums[j+1];
					nums[j] = nums[j] - nums[j+1];
				}
			}
		}
		System.out.println("");
		System.out.println("ÅÅĞòºó");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
	}
}
