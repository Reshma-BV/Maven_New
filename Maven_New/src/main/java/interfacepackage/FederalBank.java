package interfacepackage;

public class FederalBank implements Bank
{
public void interest()
{
	System.out.println("Interst rate is 10");
}
public void displayfederal()
{
	System.out.println("Can't call this method using inteface object variable,need to create new object for this class");
}
	public static void main(String[] args) 
	{
		Bank obj=new FederalBank();
		obj.interest();
		FederalBank fedobj=new FederalBank();
		fedobj.displayfederal();
	}

}
