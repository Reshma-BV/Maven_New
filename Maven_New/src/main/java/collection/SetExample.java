package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample 
{

	public static void main(String[] args) 
	{
		Set <Integer> s1=new HashSet<Integer>();//interface
		s1.add(10);
		s1.add(30);
		s1.add(50);
		s1.add(70);
		s1.add(100);
		s1.add(50);
		
		System.out.println(s1);
		
		HashSet<Integer> h1=new HashSet<Integer>();//Class
		h1.add(100);
		h1.add(200);
		h1.add(300);
		h1.add(400);
		h1.add(500);
		System.out.println(h1);

		HashSet h2=new HashSet();
		h2.add("Value");
		h2.add(250);
		h2.add("new");
		h2.add(300);
		h2.add("new");

		System.out.println(h2);
		h2.remove("Value");
		System.out.println(h2);
		Iterator <Integer> it= h2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		h2.addAll(h1);
		System.out.println(h2);
		h2.removeAll(h1);
		System.out.println(h2);
		System.out.println(h2.size());
		System.out.println(h2.contains(300));
	}

}
