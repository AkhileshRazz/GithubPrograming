package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class B015_RemoveDuplicateWordFromString {

	
	public static void main(String[] args) {
		String str="In The Box In Box";
		String[] st = str.split(" ");
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < st.length; i++) {
			lhm.put(st[i], lhm.getOrDefault(st[i], 0)+1);			
		}
		for(Entry<String, Integer> e : lhm.entrySet()) {
			System.out.println(e.getKey());
		}
	}
}
