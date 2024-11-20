package abstraction;

public abstract class Flowerabs 
{
	String flower;
	Flowerabs()
	{
		System.out.println("Constructor for abstract class");
	}
	Flowerabs(String flower)
	{
		 this.flower=flower;
		 System.out.println(flower);
	}
	abstract void show();
	public void display()
	{
		System.out.println("Flower abstarct class");
	}
}
  