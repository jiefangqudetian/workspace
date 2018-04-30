package javaSE1127;


import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List list = new ArrayList();
		list.add(123);
		list.add("ada");
		list.add(true);
		list.add(3.14);
		int a = (int)list.get(0);
		String b = (String)list.get(1);
		boolean c = (boolean)list.get(2);
		double d = (double)list.get(3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add(4, "ee");
		list.remove(0);
//		String str = list.get(0);
//		String str2 = list.get(1);
//		System.out.println(str);
//		
//		List<String> list2 = list.subList(0, 4);
		/*Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str);
		}*/
		
//		for(String string : list2){
//			System.out.println(string);
//		}
//		System.out.println("_________");
//		System.out.println(list.size());
//		System.out.println(list.contains("bb"));
//		System.out.println(list.get(0));
//		System.out.println(list.indexOf("cc"));
//		System.out.println(list.lastIndexOf("cc"));
//		System.out.println(list.isEmpty());
//		list.set(0, "element");
//		System.out.println(list.get(0));
//		Map<String, String> maps = new HashMap<>();
//		HashMap<Integer, Integer> map = new HashMap<>();
		int[] strr = {1,2,3,4};
		
		System.out.println(Arrays.toString(strr));
		
		String string = new String();
		System.out.println(string.length());
		
	}

}
