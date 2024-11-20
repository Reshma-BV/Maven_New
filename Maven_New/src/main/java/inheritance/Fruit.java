package inheritance;

public class Fruit extends Flower
{
public void strawberry()
{
	System.out.println("Summer Fruits");
}
	public static void main(String[] args) 
	{
		Fruit ft=new Fruit();
		ft.oaktree();
		ft.strawberry();
		ft.lavender();
	}

}
