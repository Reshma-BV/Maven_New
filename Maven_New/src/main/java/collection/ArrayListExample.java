package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample 
{
	
	public static void main(String[] args) 
	{
		List <String> li=new ArrayList();
		li.add("Red");
		li.add("Orange");
		System.out.println(li);
		
		System.out.println("Non generic Collection");
		ArrayList al=new ArrayList();
		al.add(4);
		al.add("Nivaan");
		al.add('a');
		System.out.println(al);
		
		System.out.println("Generic Collection");
		ArrayList <String> al2=new ArrayList();
		System.out.println(al2.isEmpty());
		al2.add("Reshma");
		al2.add("Greeshma");
		al2.add("Reshma");
		al2.add(null);
		al2.add(null);
		System.out.println(al2);
		al2.remove(4);
		System.out.println(al2);
		al2.remove("Reshma");//remove value using index
		System.out.println(al2);
		al2.remove("greeshma");
		System.out.println(al2);
		System.out.println(al2.size());
		System.out.println(al2.isEmpty());
		for(int i=0;i<al2.size();i++)
		{
			System.out.println(al2.get(i));//get method
		}
		
		System.out.println(al2.contains("Greeshma"));//for search
		System.out.println("For each loop");

		for(String i:al2)
		{
			System.out.println(i);
		}
		
		ArrayList <String> al3=new ArrayList();
		al3.add("Pink");
		al3.add("Yellow");
		al3.add("Violet");
		//Adding one arraylist to another
		System.out.println(al2.addAll(al3));
		System.out.println(al2);
		//Remove from one list
		al2.removeAll(al3);
		System.out.println(al2);
		
		
		

		
	}

}
