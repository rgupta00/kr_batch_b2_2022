package backup;

public class Employee {
	private int id = 0;
	private String name = "foo";
	private double salary = 500;
	private static String companyName = "Kronos";

	// getter and setters

	
	
	// ctr is used to init the instance varaible

	// can i call one ctr from other : Yes this()

	// DRY concepts: Don't repeat yourself

	// init block
	{
		System.out.println("common code..1.");

	}
	
	{
		System.out.println("common code...2");

	}

	public Employee() {

		// this(22,"amit",80000);
		System.out.println("it is a defult ctr");
	}

	public Employee(int id, String name, double salary) {

		System.out.println("it is a para ctr");
		// this keyword is helping us to resolve confusion bw local varaible and instane
		// variable...
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary(double amout) {
		///
		if (amout <= 0 || amout > 300000) {
			System.out.println("invalid inpput...");
		}
	}

	public void print() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);

	}
}
