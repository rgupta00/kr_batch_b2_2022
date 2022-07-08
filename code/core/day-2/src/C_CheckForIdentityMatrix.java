
public class C_CheckForIdentityMatrix {

	public static void main(String[] args) {
		
		int a[][]= {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
		
		//print2DArray(a);
		
		//proof by contradition 
		boolean isIdentityMatrix = checkForIdentityMatrix(a);
		
		System.out.println(isIdentityMatrix);
		
	}

	public static boolean checkForIdentityMatrix(int[][] a) {
		boolean isIdentityMatrix=true;
		
		for(int i=0;i<a.length; i++) {
			for(int j=0;j<a[i].length; j++) {
				if(i==j) {
					if(a[i][j]!=1) {
						isIdentityMatrix=false;
						break;
					}
				}else {
					if(a[i][j]!=0) {
						isIdentityMatrix=false;
						break;
					}
				}
			}
		}
		return isIdentityMatrix;
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






