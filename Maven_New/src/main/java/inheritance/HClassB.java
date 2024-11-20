package inheritance;

public class HClassB extends HeirarchialParent
{
public void b()
{
	System.out.println("Second Child class");
}
	public static void main(String[] args) 
	{
		HClassB objb=new HClassB();
		objb.b();
		objb.parent();
		HClassA objs=new HClassA();
		objs.childOne();
	}

}
