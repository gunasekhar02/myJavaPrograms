
public class LinearSearchAlgo {
	
	static int LinearSearch(int arr[],int key) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,12,16,28,36,89};
		int k=28;
		System.out.println(LinearSearch(a,k));

	}

}
