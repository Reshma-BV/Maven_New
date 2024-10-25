package string;

public class String_equalsIgnoreCase 
{

	public static void main(String[] args) 
	{
		String s1="Welcome";
		String s2="Welcome";
		String S3="welcome";
		String s4="Hello";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(S3));
		System.out.println(S3.equalsIgnoreCase(s4));

	}

}
