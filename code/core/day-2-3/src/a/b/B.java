package a.b;

public class B {
	private int i = 55;
	int j = 505;
	protected int k = 550;
	public int l = 5500;

	private void fooPrivate() {
		System.out.println("i am a private method ...");
	}

	void fooDefault() {
		System.out.println("i am a defaut method ...");
	}

	protected void fooProtected() {
		System.out.println("i am a protected method ...");
	}

	public void fooPublic() {
		System.out.println("i am a public method ...");
	}

}
