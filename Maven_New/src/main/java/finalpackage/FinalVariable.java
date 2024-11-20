package finalpackage;

public class FinalVariable 
{
	//final int x= 10;
	public void show()
	{
		int x=20;
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		FinalVariable obj=new FinalVariable();
		obj.show();
	}

}
