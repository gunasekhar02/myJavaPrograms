package DynamicProgramming;

import java.util.Scanner;
import java.util.*;

public class FibanocciSeries {

	public static int[] calFibonacci(int n) {
		int[] fibarray=new int[n+1];
		if(n==0) {
			fibarray[0]= 0;
			return fibarray;
		}
		fibarray[0]=0;
		fibarray[1]=1;
	    for(int i=2;i<=n;i++) {
	    	fibarray[i]=fibarray[i-1]+fibarray[i-2];
			}
		return fibarray;
		
	}

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		System.out.println();
		System.out.println(Arrays.toString(calFibonacci(n)));
	}

}
