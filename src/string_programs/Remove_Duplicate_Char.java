package string_programs;

public class Remove_Duplicate_Char {

	public static void main(String[] args) {
		
		String s = "proggramming";
    String out = "";
		for(int i = 0;i<s.length();i++) {
			int count = 1;
			for(int j=i+1;j<s.length();j++) {
				char f = s.charAt(i);
				char l = s.charAt(j);
				if(f==l) {
					count++;
				}
				}
			if(count==1) {
				out = out + s.charAt(i);
			}
		}
		System.out.println(out);
	}
}
