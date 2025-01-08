package Polymorphisam;

public class Polymorphisamchild extends Polymorphisam{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphisamchild obj=new Polymorphisamchild();
		obj.display(1, 2);
	}
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		super.display(2, 3);//method overriding
	}
}
