
//why not abstraction 

class Vehical {
	public abstract  void move(String s, String d);
}

class Metro {
	public void move(String s, String d) {
		System.out.println("passanger is moving from " + s + " " + d + " using metro");
	}
}

class Car {
	public void move(String s, String d) {
		System.out.println("passanger is moving from " + s + " " + d + " using car");
	}
}


class Passanger {
	private String passangeName;

	public Passanger(String passangeName) {
		this.passangeName = passangeName;
	}

	public void travel(String s, String d, Car car) {
		System.out.println("passanger name: "+ passangeName);
		car.move(s, d);
	}
}

public class G_PassangerProblem {

	public static void main(String[] args) {
		//Metro metro=new Metro();
		Car car=new Car();
		
		Passanger passanger=new Passanger("amit");
		passanger.travel("Laxmi nagar", "Nodia", car);
		
		
	}

}
