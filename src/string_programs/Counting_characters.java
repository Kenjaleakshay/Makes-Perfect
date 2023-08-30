package string_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Counting_characters {

	public static void main(String[] args) {
		
		String str = "rdautomation ";
		
		
		HashMap<Character,Integer> hm = new HashMap();
		
	    char[] arr = str.toCharArray();
		for(char ch : arr) {
			
			if(!String.valueOf(ch).isBlank()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
			}
			
		}
		System.out.println(hm);
		
		Iterator<Character> it = hm.keySet().iterator();  //Iterator is also like other colle. Set
                                                          // so it requires data type		
		int max = -1;
		while(it.hasNext()) {
			
			Character key = it.next();
			int val = hm.get(key);
			if(val>max) {
				max = val;
			}
		}
		
		Iterator<Map.Entry<Character,Integer>> it1 = hm.entrySet().iterator();
		
		HashMap<Character,Integer> hmnew = new HashMap();
		
	/*	while(it1.hasNext()) {
			
			Entry<Character,Integer> en = it1.next();
			int val = en.getValue();
			if(val==max) {
				hmnew.put(en.getKey(),en.getValue() );
			}
		} */
		
		Iterator<Character> it2 = hm.keySet().iterator();
		while(it2.hasNext()) {
			
			Character key = it2.next();
			Integer val = hm.get(key);
	    	if(val==max) {
				hmnew.put(key, val);
			}
		}
		
		System.out.println("max occuring char are " + hmnew);
		
		
	}
}
