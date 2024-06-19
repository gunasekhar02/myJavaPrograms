package PracticeArrays;
import java.util.*;

public class SecondMaxOfAnArray {
	
	int secondMax(int[] arr) {
		int s=arr.length;
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<s;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
		
	}

	public static void main(String[] args) {
		SecondMaxOfAnArray sma=new SecondMaxOfAnArray();
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[]arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(sma.secondMax(arr));

	}

}
