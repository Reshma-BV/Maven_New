package string;

public class String_StartsWith
{

	public static void main(String[] args)
	{
		String s1="Hello world";
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.startsWith("ma"));//check the content starts with and consider case sensitive /not

	}

}
