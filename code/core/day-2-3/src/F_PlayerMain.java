
public class F_PlayerMain {
	public static void main(String[] args) {
		Player player=new Player("ravi");
		player.print();
		
		Player player2=new Player("sachin");
		player2.print();
		
		System.out.println(Player.getCounter());
		
		//System.out.println(player2.getCounter());
	}

}
