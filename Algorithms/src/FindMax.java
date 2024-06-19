

public class FindMax {
	
	static int maxofArray(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {90,3,5,6,89,2};
		System.out.println(maxofArray(a));
		}

	}