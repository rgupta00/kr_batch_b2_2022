package a.c;

//java class loader: on demand
import a.b.B;

public class Client extends B{

	public static void main(String[] args) {
		Client b = new Client();
		System.out.println(b.l);
		System.out.println(b.k);
		b.fooProtected();
		b.fooPublic();
	}
}
