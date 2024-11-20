package abstraction;

public class Lavender extends Flowerabs
{
public void show()
{
	System.out.println("Class with main method for abstarct method");
}
	public static void main(String[] args) 
	{
		Lavender obj=new Lavender();
		//Lavender lobj=new Lavender("Rose");
		obj.display();
		obj.show();
	}

}
