package Superkeyword;

public class Supermethodchild extends Supermethodparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermethodchild obj=new Supermethodchild();
		obj.display1();
	}
	public void display1()
	 {
		 System.out.println("child class");
		 super.display();
	 }

}
