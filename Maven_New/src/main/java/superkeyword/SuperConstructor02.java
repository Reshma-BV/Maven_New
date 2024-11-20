package superkeyword;

public class SuperConstructor02 extends SuperConstructor01
{
	SuperConstructor02 ()
	{
		//super(); //in constructor Super keyword should be the first statement
		System.out.println("Super Constructor main class");
	}

	public static void main(String[] args) 
	{
		SuperConstructor02 objchild=new SuperConstructor02 ();	
	}

}
