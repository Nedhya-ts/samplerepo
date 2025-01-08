package aggregation;

public class Aggregationchild {

	String city;
	int rollno;
	Aggregationparent ref; //aggregation  datatype
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregationparent obj1=new Aggregationparent("nedhya",16);
		Aggregationchild obj=new Aggregationchild(1,"pattambi",obj1);
		obj.dispaly();
	}
public Aggregationchild(int rollno,String city,Aggregationparent ref)
{
	this.city=city;
	this.rollno=rollno;
	this.ref=ref;
}
public void dispaly()
{
	System.out.println(rollno +city);
	System.out.println(ref.name + ref.age);
}
}
