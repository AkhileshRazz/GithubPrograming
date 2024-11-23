package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class B006_PrintOnlyDuplicat {

	public static void main(String[] args) { 	
		String str="Bengaluru";
		String st = str.toLowerCase();
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character, Integer>();		
		for (int i = 0; i < st.length(); i++) {
			hm.put(st.charAt(i), hm.getOrDefault(st.charAt(i),0)+1)	;
		}
		for(Entry<Character, Integer> e:hm.entrySet())
		{
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
		

	}

}
