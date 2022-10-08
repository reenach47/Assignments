package AssignmentOOPS;

class login{
	 void name() {
	 System.out.println("enter your name");
}
}
class addben extends login{
	 void acctnumber() {
	 System.out.println("enter your benacct number");
}
}

public class inheritence {

	public static void main(String[] args) {
		addben a=new addben();
		a.name();
		a.acctnumber();
		
		

	}

}
