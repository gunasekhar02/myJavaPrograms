
public class FindMin {
	
	static int minofArray(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {90,3,5,6,89,2};
		System.out.println(minofArray(a));
		}

	}


