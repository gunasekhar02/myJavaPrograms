
public class BinarySearch {
	static int binarysearch(int [] arr,int key) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(key<arr[mid]) {
				end=mid-1;
			}
			else if(key>arr[mid]) {
				start=mid+1;
				
			}
			else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,78,90,102,304,789};
		int k=304;
		System.out.println(binarysearch(a,k));

	}

}
