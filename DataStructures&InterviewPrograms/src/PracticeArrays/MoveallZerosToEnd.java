package PracticeArrays;

import java.util.Scanner;
import java.util.*;

public class MoveallZerosToEnd {
	
	int[] performAction(int[] arr) {
		int s=arr.length;
		int s1=0;
		int e1=s-1;
		while(s1<e1) {
			if(arr[s1]==0) {
				int temp=arr[e1];
				arr[e1]=arr[s1];
				arr[s1]=temp;
				e1--;
				s++;
			}else {
				s1++;
			}
		}
		return arr;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveallZerosToEnd moe=new MoveallZerosToEnd();
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[]arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(moe.performAction(arr)));
	}

}
