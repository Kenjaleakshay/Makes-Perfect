package string_programs;

import java.util.HashMap;

public class Vowel_String {

	public static void main(String[] args) {
		
		String str = "jaoqpnxnbvojdu";
		
		int count = 0;
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				
				count++;
			}
		}
		System.out.println(count);
		countingVowels();
		immutable();
		countingVowels2();
	}
	
	  public static void countingVowels() {
		  
		   String s = "aoueonvbieos";
		   
		   String vowel = "aeiou";
		   
		   HashMap<Character,Integer> hm = new HashMap();
		   
		 for(int i=0;i<vowel.length();i++) {
			 for(int j=0;j<s.length();j++) {
				 
				 char vo = vowel.charAt(i);
				 char str = s.charAt(j);
				 if(vo==str) {
					 if(hm.get(vo)==null) {
						 hm.put(vo, 1);
					 }else {
						 hm.put(vo, hm.get(vo)+1);
					 }
				 }
				  }
		 }
		 System.out.println(hm);

   }
	  
	  public static void immutable() {
		  
		  String s1 = "Pune";
		  String s2 = "Pune";
		  s2="Bhosari";
		  System.out.println(s2 + s1);
		  
		  int a1 = 5;
		  int a2 = 5;
		  int a3 = 5;
		  a3 = 4;
		  System.out.println(a1 + " " + a3);
		  
		  }
	 
	  public static void countingVowels2() {
		  
		   String s = "aoueonvbieos";
		   
		   String vowel = "aeiou";
		   
		   HashMap<Character,Integer> hm = new HashMap();
		   
		 for(int i=0;i<vowel.length();i++) {
			 for(int j=0;j<s.length();j++) {
				 
				 char vo = vowel.charAt(i);
				 char str = s.charAt(j);
				 if(vo==str) {
					 if(hm.containsKey(vo)) {
						 hm.put(vo, hm.get(vo)+1);
					 }else {
						 hm.put(vo, 1);
					 }
				 }
				  }
		 }
		 System.out.println(hm);

  }
}