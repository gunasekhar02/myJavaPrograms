import java.util.Arrays;

public class SelectionSort {
	static int[] sort(int[] arr) {
		int l=arr.length;
		for(int s=0;s<l;s++) {
			int min_index=s;
			for(int i=s+1;i<l;i++) {
				if(arr[i]<arr[min_index]) {
					min_index=i;
				}
			}
			int temp=arr[s];
			arr[s]=arr[min_index];
			arr[min_index]=temp;
			
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,9,0,34,56,7,8,1,2};
		System.out.println(Arrays.toString(sort(a)));
	}

}
