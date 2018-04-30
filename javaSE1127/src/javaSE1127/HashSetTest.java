package javaSE1127;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("dd");
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		System.out.println(set.contains("aa"));
//		set.remove("aa");
		System.out.println(set.contains("aa"));
//		set.clear();
		System.out.println(set.contains("bb"));
		System.out.println(set.size());
		set.add("aa");
		System.out.println(set.size());
		for(String str: set) {
			System.out.println(str);
		}
		System.out.println(set.isEmpty());
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());;
			
		}
//		System.out.println(set.containsAll(list)); //查看set中是否包含collection集合中所有元素
//		set.addAll(list); //添加集合collection中的所有元素到set中，如果有不再重复添加
		System.out.println(set.size());
		System.out.println(set.equals(list));//比较对象必须也是set才可能相等
		Object[] strings = set.toArray();
		System.out.println(Arrays.toString(strings));//Arrays.toString()输出数组
		int[] nums = {1,2,3,4,5};
		System.out.println(Arrays.toString(nums));
		set.getClass();
		System.out.println(set.getClass());
		System.out.println(set.remove("vv"));
		
		Students studen = new Students();
		System.out.println(studen);
		
		
	}
}
