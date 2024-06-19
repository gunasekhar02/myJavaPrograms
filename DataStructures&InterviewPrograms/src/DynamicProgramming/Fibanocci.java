package DynamicProgramming;

import java.util.Scanner;
import java.util.*;

public class Fibanocci {
	public static int calFibonacci(int n) {
		if(n==0) {
			return 0;
		}
		int[] table=new int[n+1];
		table[0]=0;
		table[1]=1;
	    for(int i=2;i<=n;i++) {
				table[i]=table[i-1]+table[i-2];
			}
		return table[n];
		
	}

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		System.out.println();
		System.out.println(calFibonacci(n));
	}
}
