package finalpackage;

public class FinalMethod02 extends FinalMethod01
{
public void show()
{
	super.show();
	System.out.println("Final overriding in child class");
}
	public static void main(String[] args)
	{
		FinalMethod02 obj=new FinalMethod02();
		obj.show();
	}

}
