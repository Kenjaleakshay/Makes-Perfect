package string_programs;

public class Reverse_String {
	
     public static void main(String[] args) {
    	 
    	 String tr = "Google";
    	 String rev = "";
    	 
    	 for(int i=tr.length()-1;i>=0;i--) {
    		 
    		 char temp = tr.charAt(i);
    		 rev = rev + temp;
    		 
    	 }
    	 System.out.println(rev);
    	 
    	 
    	 
    	 
     }

     public static void reverse1() {
    	 
    	 String s = "hello";
    	 StringBuffer sb = new StringBuffer(s);
    	 StringBuilder sbl = new StringBuilder(s);
    	 System.out.println(sb.reverse() +" " + sbl.reverse());
    	 
     }
     
  
}
