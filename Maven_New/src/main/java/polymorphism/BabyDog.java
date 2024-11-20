package polymorphism;

public class BabyDog extends Dog
{
	public void barking()
	{
		//super.barking();
		System.out.println("Baby Dog");
		
	}
	public static void main(String[] args) 
	{
		BabyDog obj=new BabyDog();
		obj.barking();
	}

}
