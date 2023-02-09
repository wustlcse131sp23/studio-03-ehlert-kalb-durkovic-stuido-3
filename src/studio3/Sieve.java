package studio3;

import java.util.Scanner;

public class Sieve {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What number do you want to check from prime numbers up to?");
		int num = in.nextInt();
		
		System.out.println("Count prime numbers up to " + num);
		
		boolean prime[] = new boolean [num+1];
			for (int i = 2; i < num; i++) {
				prime[i] = true;
			}	
			for (int p=2; p<num; p++) {
				for (int x = 2*p; x < num; x+=p) {
					// first remove all the multiples of 2 (but not 2)
					prime[x] = false;
						
				}
			}
			System.out.print("The prime numbers are: ");
			for (int i = 0; i < num; i++) {
				if (prime[i] == true) {
					
					System.out.print(i + ", " );
				}
				
		
}
}
}
