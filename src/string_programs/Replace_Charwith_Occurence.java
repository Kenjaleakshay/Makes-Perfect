package string_programs;

public class Replace_Charwith_Occurence {

	public static void main(String[] args) {
		
		String s = "opentext";
		
		String output = "";
		char replace = 't';
		char temp = ' ';
		int count = 0;
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if(ch == replace) {
				count++;
				String str = String.valueOf(count);
				temp = str.charAt(0);//problem for more than 10 repeating characters
			}else {
				temp = s.charAt(i);
			}
			output = output + temp;
		}
		System.out.println(output);
		fullproofreplacingCharwithOccurence();
		
	}
	
	public static void fullproofreplacingCharwithOccurence() {
		
		String s = "opentext";
		char replace = 't';
		int count  = 0;
		for(int i=0;i<s.length();i++) {
			
			char temp = s.charAt(i);
			if(temp == replace) {
	             count++;
	             s = s.replaceFirst(String.valueOf(replace), String.valueOf(count));
	             //String is immutable, hence s = s.
	             //at second t time, first t would have been replaced by count ,so replaceFirst() will 
	             // not consider it;
			}
		}
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
