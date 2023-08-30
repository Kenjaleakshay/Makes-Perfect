package Firstpra;

import java.util.Scanner;

public class FactorialofNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int ans = 1;
		
		while(num!=1) {
			
			ans = ans*num;
			num--;
			
			}
		System.out.println(ans);
		}
}
