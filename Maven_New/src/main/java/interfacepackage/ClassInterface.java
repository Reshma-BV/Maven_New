package interfacepackage;

public class ClassInterface implements Interface01,Interface02
{
	public void method1()
	{
		System.out.println("Print method1"+MIN_VALUE+MAX_VALUE);
	}
	public void method2()
	{
		System.out.println("Print method2");
	}
	public static void main(String[] args) 
	{
		ClassInterface obj=new ClassInterface();
		obj.method1();
		obj.method2();
	}

}
