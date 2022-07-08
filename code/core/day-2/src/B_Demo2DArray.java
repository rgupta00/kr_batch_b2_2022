
public class B_Demo2DArray {

	public static void main(String[] args) {
//		int a[]=new int[5];
//		a[0]=9;
				//0  1   ...
//		int a[][]= new int[3][4];
		
		int a[][]= {{2,3,1,2},{2,3,1,24},{2,39,1,2}};
		
		print2DArray(a);
		
		
	}

	private static void print2DArray(int[][] a) {
		for(int temp[]: a) {
			for(int temp2: temp) {
				System.out.print(temp2+" ");
			}
			System.out.println();
		}
	}

	
	
	
}






