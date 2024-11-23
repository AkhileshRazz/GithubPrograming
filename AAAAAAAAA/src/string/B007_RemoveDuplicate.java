package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class B007_RemoveDuplicate {

	public static void main(String[] args) {
		String str="Bengaluru";
		String st = str.toLowerCase();
		String result="";
		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < st.length(); i++) {
			lhm.put(st.charAt(i),lhm.getOrDefault(st.charAt(i),0)+1);
		}
		
		for(Entry<Character, Integer>e:lhm.entrySet())
		{
			
			result=result+e.getKey();
			
		}
		System.out.println(result);
	}
}
