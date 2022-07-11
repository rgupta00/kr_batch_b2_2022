
class A{
	
	int i;
	private static double pi;
	
	//static init block runs only once at the time of class loading
	static {
		System.out.println("static init block");
		pi=Math.PI;
		///
	}
	
	A(){
		System.out.println("it is defult ctr");
	}
	
	A(int i) {
		this.i = i;

		System.out.println("it is par ctr");
	}
	//only for ctr: java internally append this code with ctr code
	{
		System.out.println("it is init block 1");

	}
	
	{
		System.out.println("it is init block 2");
		
	}
	
	
}



public class DemoInitBlock {
	
	public static void main(String[] args) {
		
		A a=new A();
		
		System.out.println("-------------------");
		
		A a2=new A(44);
	}

}
