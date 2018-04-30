package javaSE1127;

import java.util.List;

public class Xulieshuchu {

	public static String tostring(List<String> list) {
		if(list.isEmpty()){
			return "[]";
		}
		int imax = list.size() - 1;
		StringBuilder string = new StringBuilder();
		string.append("[");
		for(int i = 0; ; i++){
			string.append(list.get(i));
			if(i==imax){
				string.append("]");
				return string.toString();
			}
			string.append(",");
		}
		
		
	}
}
