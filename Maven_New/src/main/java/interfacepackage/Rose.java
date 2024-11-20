package interfacepackage;

public class Rose implements Flower
{
	public void show()
	{
		System.out.println("First");
	}

	public static void main(String[] args)
	{
		Rose obj=new Rose();
		obj.show();
	}

}
