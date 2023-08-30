package string_programs;

public class RemoveAll_White_Spaces {

	public static void main(String[] args) {
		
		String s= "   j a   va  ";
		String str = s.replaceAll("\\s", "");
		System.out.println(str);
		removeSpecialChar();
	}
	
	public static void removeSpecialChar() {
		
		String s = "#$^^%^&^^J*(ava&&@!";
		String str = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}
}
