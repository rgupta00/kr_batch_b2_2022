
public class A_DemoArray {

	public static void main(String[] args) {
//		int a[]=new int[5];
//		a[0]=9;
				//0  1   ...
		int a[]= {15,6,7,9,11};
		
		//...
		//print it
		//printArray(a);
		
		//enhance for loop: just for printing
		System.out.println("--enhance for loop: just for printing--");
		printArrayElementsUsingEnhanceForLoop(a);
		
		
		//waf to accept array and double each element and return it
		
		int []b= {5,96,7,9,11};
		
		
		
		
	}

	
	
	
	
	
	public static int[] doubleEachElemtnt(int arr[]) {
		for(int i=0;i<arr.length; i++) {
			arr[i]=arr[i]*2;
		}
		
		return arr;
	}
	
	
	
	private static void printArrayElementsUsingEnhanceForLoop(int[] a) {
		for(int temp: a) {
			System.out.println(temp);
		}
	}
	
	public static  void printArray(int a[]) {
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}






