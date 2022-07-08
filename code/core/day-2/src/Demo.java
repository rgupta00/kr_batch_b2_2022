class My {
	{
		System.out.println("init block");
	}

	static {
		System.out.println("i am staic method");
	}
	public  void foo() {
		System.out.println("foo static method");
	}
}

public class Demo {

	public static void main(String[] args) {
		My my=new My();
		
		my.foo();
		
		System.out.println("what is this?");
	}
}
