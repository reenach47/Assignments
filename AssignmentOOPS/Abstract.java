package AssignmentOOPS;

abstract class games{
	abstract void game();
	void g1()
	{
		System.out.println("yout fav game is ");
	}
}

public class Abstract extends games {

	public static void main(String[] args) {
		Abstract obj=new Abstract();
		obj.g1();
		obj.g2();
		}
	void g2()
	{
		System.out.println("my fav game is chess");
	}
	void game() {
	}

}
