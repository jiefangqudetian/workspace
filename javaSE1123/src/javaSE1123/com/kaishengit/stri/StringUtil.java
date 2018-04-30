package javaSE1123.com.kaishengit.stri;

public class StringUtil {

	public static boolean check(String str) {
		char[] cha = str.toCharArray();
		for(int i = 0; i < cha.length; i++) {
			int num = cha[i];
			if(num < 48 || num > 57) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkk(String str) {
		int a = str.indexOf("@");
		int b = str.indexOf(".");
		if(a!=-1 && b!=-1 && a!=0 && b>a+1) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isEmail(String str) {
		int atindex = str.indexOf("@");
		int lastAtIndex = str.lastIndexOf("@");
		int dotindex = str.indexOf(".");
		int lastDotIndex = str.lastIndexOf(".");
		//判断@和.是否存在
		if(atindex == -1 || dotindex ==-1){
			return false;
		}
		//判断@和.是否在第一位或者最后一位
		if(atindex == 0 || atindex == str.length()-1) {
			return false;
		}
		if(dotindex == 0 || dotindex == str.length()-1){
			return false;
		}
		//判断位置，.要在@后而且不能紧挨
		if(dotindex - atindex < 2){
			return false;
		}
		//判断是否有两个@
		if(atindex - lastAtIndex == 0) {
			return false;
		}
		
		//判断.的个数，不能有三个及以上
		String[] strings = str.split("\\.");
		if(strings.length > 3) {
			return false;
		}
		//判断.和.的位置不能相邻
		if(lastDotIndex - dotindex ==1) {
			return false;
		}
			
		return true;
	}
	
	
	public static boolean isEmpty(String string) {
		return string==null || string.equals("");
	}
	
	
	public static boolean isNotEmpty(String string) {
		return string!=null && !string.equals("");
	}
	
	
	
	public static boolean checkkk(String str) {
		char[] cha = str.toCharArray();
		int num = 0;
		int num1 = 0;
		int[] nums = new int[cha.length];
		int[] nums1 = new int[cha.length];
		for(int i = 0; i < cha.length; i++) {
			if(cha[i]=='@') {
				nums[num] = i;
				num++;
			}
		}
		
		for(int i = 0; i < cha.length; i++) {
			if(cha[i]=='.') {
				nums1[num1] = i;
				num1++;
			}
		}
		
		if(num!=1 ) {
			return false;
		}
		if(num1==0) {
			return false;
		}
		if(nums1[num1-1] < nums[num-1]) {
			return false;
		}
		return true;
	}
	
	public static void cut(String str) {
		char[] cha = str.toCharArray();
		char[] cha1 = new char[8];
		String birthday = "";
		for(int i = 0; i < cha1.length; i++) {
			cha1[i] = cha[i+6];
		}
		for(int i = 0; i < cha1.length; i++) {
			birthday = birthday + cha1[i];
		}
		System.out.println("生日为"+birthday);
		if(str.codePointAt(17)%2==1){
			System.out.println("性别:男");
		} else {
			System.out.println("性别:女");
		}
	}
	/*public static void cutt(String str) {
		char[] cha = str.toCharArray();
		char[] cha1 = new char[8];
		for(int i = 0; i < cha1.length; i++) {
			cha1[i] = cha[i+6];
		}
		String birthday = String.valueOf(cha1);
		System.out.println("生日为"+birthday);
		String num = String.valueOf(cha[16]);
		int sex = Integer.parseInt(num);
		if(sex%2==1){
			System.out.println("性别:男");
		} else {
			System.out.println("性别:女");
		}
	}*/
	public static void cut1(String str) {
		
		
		String year = str.substring(6,10);
		String month = str.substring(10,12);
		String day = str.substring(12,14);
		System.out.println("生日为"+year+"年"+month+"月"+day+"日");
		
		String num = str.substring(str.length()-2, str.length()-1);
		int sex = Integer.parseInt(num);
		if(sex%2==1){
			System.out.println("性别:男");
		} else {
			System.out.println("性别:女");
		}
	}
	
		
}
