package superkeyword;

public class SuperVariable2 extends SuperVariable
{
	String name="Reshma";
	void show()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) 
	{
		SuperVariable2 obj=new SuperVariable2();
		obj.show();
				
	}

}
