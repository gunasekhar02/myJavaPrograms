import java.util.Arrays;

public class InsertionSort {
	static int[] sort(int[] arr) {
		int l=arr.length;
		for(int i=1;i<l;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,9,7,4,0,34,56};
		System.out.println(Arrays.toString(sort(a)));
	}

}
