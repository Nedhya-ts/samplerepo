package Superkeyword;

public class Superconstructorchild extends Superconstructorparent{
	public  Superconstructorchild()
	{
		super(2,3);
		System.out.println("child class");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superconstructorchild obj=new Superconstructorchild();
	}



}

