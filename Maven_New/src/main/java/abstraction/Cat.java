package abstraction;

public class Cat extends Animal
{
	public void show()
	{
		System.out.println("Abstarction2");
	}
	public static void main(String[] args)
	{
		Cat obj=new Cat();
		obj.show();
		obj.display();
	}

}
