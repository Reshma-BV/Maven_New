package inheritance;

public class BabyDog extends Dog
{
public void sleep()
{
	System.out.println("sleep time");
}
	public static void main(String[] args) 
	{
		BabyDog bdog=new BabyDog ();
		bdog.eat();
		bdog.sleep();
	}

}
