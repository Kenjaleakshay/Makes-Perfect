package string_programs;

public class Reverse_eachWord {
	
	public static void main(String[] args) {
		
		String s = "Java code";
		String[] ar = s.split(" ");
		String output = "";
		for(int i=0;i<ar.length;i++) {
			String rev = "";
			for(int j=ar[i].length()-1;j>=0;j--) {
				
				char ch = ar[i].charAt(j);
				rev = rev + ch;
			}
			rev = rev + " ";
			output = output + rev;
		}
		
		System.out.println(output);
		
	}

}
