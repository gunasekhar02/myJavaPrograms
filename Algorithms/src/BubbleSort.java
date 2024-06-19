import java.util.Arrays;

public class BubbleSort {
	static int[] sort(int [] arr) {
		int l=arr.length;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,4,7,2,0,5,78,90,234,56,98};
		System.out.println(Arrays.toString(sort(a)));

	}

}
