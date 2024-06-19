package DynamicProgramming;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n) {
		int[] table=new int[n+1];
		table[0]=1;
		if(n==0) {
			return 0;
		}
		for(int i=1;i<=n;i++) {
			table[i]=i*table[i-1];
		}
		return table[n];
	}
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		System.out.println();
		System.out.println(fact(n));
	}
}
