package finalpackage;

public class FinalClass02 extends FinalClass01 
{
	public void display()
	{
		//super.show();
		System.out.println("Child class");
	}
	public static void main(String[] args) 
	{
		FinalClass02 obj=new FinalClass02();
		obj.display();
	}

}
