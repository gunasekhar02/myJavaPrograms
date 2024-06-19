package PracticeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {

	static int findMissingNum(int[] arr) {
		int s=arr.length+1;
		// we know that sum of first n natural numbers is ((n*(n+1))/2)
		int sumofarray=0;
		int originalSum=((s*(s+1))/2);
		for(int i=0; i<s-1;i++) {
			sumofarray+=arr[i];
		}
		return originalSum-sumofarray;		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[]arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(findMissingNum(arr));

	}

}
