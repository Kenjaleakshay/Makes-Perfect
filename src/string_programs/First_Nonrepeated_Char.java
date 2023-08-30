package string_programs;

public class First_Nonrepeated_Char {

	public static void main(String[] args) {
		
		String s = "arrogant";
		char nonr = ' ';
		for(int i=0;i<s.length();i++) {
			int count = 0;
			for(int j=0;j<s.length();j++) {
				char l = s.charAt(i);
				char c = s.charAt(j);
				if(i!=j && l==c) {
				count++;
			     break;
				}
			}
			if(count==0) {
				nonr = s.charAt(i);
				break;
		}
			
		}
		System.out.println(nonr);
	}
}
