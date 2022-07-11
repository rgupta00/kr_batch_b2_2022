
//why abstraction : interface vs abs class
//

//abstract class Vehical {
//	public abstract  void move(String s, String d) ;
//}
 interface Vehical {
	public abstract  void move(String s, String d) ;
}
class Bike implements Vehical{
	public void move(String s, String d) {
		System.out.println("passanger is moving from " + s + " " + d + " using bike");
	}
}

class Metro implements Vehical{
	public void move(String s, String d) {
		System.out.println("passanger is moving from " + s + " " + d + " using metro");
	}
}

class Bus implements Vehical{
	public void move(String s, String d) {
		System.out.println("passanger is moving from " + s + " " + d + " using bus");
	}
}


class Passanger {
	private String passangeName;

	public Passanger(String passangeName) {
		this.passangeName = passangeName;
	}

	public void travel(String s, String d,Vehical vehical) {
		System.out.println("passanger name: "+ passangeName);
		vehical.move(s, d);
	}
}

//A passanger named raj is moving from PV to CP using metro
public class G_PassangerProblem {

	public static void main(String[] args) {
		
		
		Vehical vehical=new Bus();
		//Car car=new Car();
		//Bus bus=new Bus();
		Passanger passanger=new Passanger("amit");
		passanger.travel("Laxmi nagar", "CP", vehical);
		
		
	}

}
