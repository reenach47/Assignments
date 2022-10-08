package AssignmentOOPS;

class Game{
	void games() {
		System.out.println("your fav game");
		
	}
}
public class overiding extends Game{

	public static void main(String[] args) {
		overiding obj=new overiding();
		obj.games();
	}
	void games()
	{
		super.games();
		System.out.println("my fav game is chess");
		
		

	}

}


			
		

	
