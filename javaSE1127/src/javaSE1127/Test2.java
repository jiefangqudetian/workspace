package javaSE1127;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		Map<String, String> maps = new HashMap<>();
		maps.put("a1", "b1");
		maps.put("a2", "b2");
		maps.put("a3", "b3");
		System.out.println(maps.containsKey("a1"));
		System.out.println(maps.containsValue("b1"));
		
		Set<Entry<String, String>> set = maps.entrySet();
		for(Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "-->" + value);
		}
		System.out.println(maps.get("a1"));
		System.out.println(maps.get("a2"));
		System.out.println(maps.get("a3"));
		System.out.println(maps.isEmpty());
		Set<String> set2 = maps.keySet();
		for(String key: set2) {
			String value = maps.get(key);
			System.out.print(key);
			System.out.println("  "+value);
		}
		Map<String, String> map2 = new HashMap<>();
		maps.putAll(map2);
		map2.put("1a", "1b");
		map2.put("2a", "2b");
		map2.put("3a", "3b");
		maps.putAll(map2);
		System.out.println(map2.containsKey("a1"));
		
		maps.remove("a1");
		System.out.println(maps.containsKey("a1"));
		System.out.println(maps.size());
		System.out.println(maps.containsKey("3a"));
		Collection<String> arrayList = maps.values();
		System.out.println(arrayList.size());
		for(String str: arrayList) {
			System.out.println(str);
		}
		
		
		
	}
}
