package PracticeArrays;
import java.util.*;

public class PalindromeCheck {

	static boolean palindromeOrNot(String s) {
		char[] sarr=s.toCharArray();
		int end=s.length()-1;
		int start=0;
		while(start<end) {
			if(sarr[start]!=sarr[end]) {
				return false;

			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(palindromeOrNot(s));
		

	}

}
