package string_programs;

public class Longest_Substring {
	
	public static void main(String[] args) {
		
		String s = "opentext";
		
		String substring = "";
		for(int i=0;i<s.length();i++) {
			int count = 0;
			for(int j=i+1;j<s.length();j++) {
				char f = s.charAt(i);
				char l = s.charAt(j);
				if(f==l) {
				count++;	
				}
			}
			if(count==0) {
				substring = substring + s.charAt(i);
			}
			}
		System.out.println(substring);
	}

}
