
public class Player {
	private int id;
	private String name;
	 static int counter=1;
	
	 //static method dont have "this"
	 public static int getCounter() {
		 //u can not acess not static data
		// System.out.println(this.id);
		return counter;
	 }
	 
	public Player( String name) {
		this.id = counter++;
		this.name = name;
	}
	
	public void print() {
		System.out.println("id : "+ id);
		System.out.println("name: "+ name);
	}
	
}
