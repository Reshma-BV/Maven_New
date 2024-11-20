package polymorphism;

public class OverLoading 
{
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public int sum(int a,int b)
	{
		int c=a*b;
		return c;
	}

	public static void main(String[] args) 
	{
		OverLoading obj=new OverLoading();
		System.out.println(obj.sum(10,30));
		obj.sum();
		
	}

}
