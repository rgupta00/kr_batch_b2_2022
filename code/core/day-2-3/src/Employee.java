
public class Employee {
	private int id = 0;
	private String name = "foo";
	private double salary = 500;
	private static String companyName = "Kronos";

	// getter and setters

	public Employee() {
		System.out.println("it is a defult ctr");
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(int id, String name, double salary) {
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
