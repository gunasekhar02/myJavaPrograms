import java.util.Arrays;

public class Searchin2DArray {
	
	static int[] Search(int[][] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==key) {
					return new int[] {i,j};
				}
				
			}
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{10,20,30},
				{60,80,90,100},
				{12,34,56},
				{1,2,3,4,5,6}
		};
		int k=100;
		System.out.println(Arrays.toString(Search(a,k)));

	}

}
