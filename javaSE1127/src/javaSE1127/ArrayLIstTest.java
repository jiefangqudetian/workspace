package javaSE1127;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLIstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add(4, "ee");
		list.add(0,"oo");
		list.add("ff");
		list.add("ff");
		list.add("ff");
		list.add("ff");
		list.add("ff");
		list.add("ff");
		System.out.println(list.size());
		System.out.println(list.get(5));
		System.out.println(list.isEmpty());
		System.out.println(list.contains("aa"));
		System.out.println(list.remove("aa"));
		System.out.println(list.indexOf("bb"));
		System.out.println(list.lastIndexOf("bb"));
		Object[] strings = list.toArray();
		
		System.out.println(Arrays.toString(strings));
		System.out.println(Xulieshuchu.tostring(list));
	}

}
