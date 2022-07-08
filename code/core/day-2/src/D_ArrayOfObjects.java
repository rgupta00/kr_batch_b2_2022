
class Dog{
	public void sound() {
		System.out.println("bho bho...");
	}
}
public class D_ArrayOfObjects {

	public static void main(String[] args) {

		//array of objects

//		Dog dogs[]=new Dog[5];
//		dogs[0]=new Dog();
		//
		
		Dog dogs[]= {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
				
		for(Dog dog: dogs) {
			dog.sound();
		}

		
		
	}

}
