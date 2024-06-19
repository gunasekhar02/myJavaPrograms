import java.util.Arrays;

public class MergeSort {
	static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid=(arr.length)/2;
		int[] left=mergeSort(Arrays.copyOfRange(arr,0, mid));
		int[] right=mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
		return merge(left,right);
	}

	private static int[] merge(int[] first, int[] second) {
		// TODO Auto-generated method stub
		int[] ans=new int[first.length + second.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<first.length && j<second.length) {
			
			if(first[i]<second[j]) {
				ans[k]=first[i];
				i++;
			}
			else {
				ans[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length) {
			ans[k]=first[i];
			i++;
			k++;
		}
		while(j<second.length) {
			ans[k]=second[j];
			j++;
			k++;
		}
		return ans;
	}
		
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,1,0,9,45,67,8,9,23,41,56,0,2,3};
		a=mergeSort(a);
		System.out.println(Arrays.toString(a));
		}

}
