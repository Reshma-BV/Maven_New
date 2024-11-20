
public class Football extends Sports
{
public void play()
{
	System.out.println("Child two: Football");
}
	public static void main(String[] args) 
	{
		Sports sports;
		sports=new Football();
		sports.play();
		sports=new Cricket();
		sports.play();
		sports=new Sports();
		sports.play();
	}

}
