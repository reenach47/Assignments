package AssignmentOOPS;

interface inter1{
	void g1();
	}
interface inter2 extends inter1{
	void g2();
}
public class Interface implements inter1,inter2{
 public static void main(String[] args) {
	 Interface obj= new Interface();
	 obj.g1();
	 obj.g2();
}
 public void g1() {
	 System.out.println("your fav game");
	 }
 public void g2() {
	 System.out.println("my fav game is chess");
}
}
