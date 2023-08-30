package string_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_CharacterString {
	
	public static void main(String[] args) {
		
		String str = "oajaojsasA";
		String main = str.toLowerCase();
		
		Set<Character> li = new HashSet();
		char[] ch = main.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(String.valueOf(ch[i]).equals(String.valueOf(ch[j]))) {
					
					li.add(ch[i]);
					
						}
			}
			}
		System.out.println(li);
		
		
		
		
	}

}
