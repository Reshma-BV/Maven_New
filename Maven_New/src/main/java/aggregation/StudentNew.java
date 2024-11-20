package aggregation;

public class StudentNew 
{
	int stuid;
	String stuname;
	Address add;
	
	StudentNew (int stuid,String stuname,Address add)
	{
		this.stuid=stuid;
		this.stuname=stuname;
		this.add=add;
	}
	public void display()
	{
		System.out.println(stuid+stuname);
		System.out.println(add.houseno+add.streetname+add.zipcode);
	}
	public static void main(String args[])
	{
		Address addobj=new Address(8,"RC Street",001 );
		StudentNew stunew=new StudentNew(10,"Riya",addobj);
		stunew.display();
	}
}
