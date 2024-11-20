package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListInt 
{

	public static void main(String[] args) 
	{
		ArrayList <Integer>al1=new ArrayList();
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(60);
		al1.add(70);
		al1.add(80);
		System.out.println(al1);
		
		al1.removeFirst();
		System.out.println(al1);
		
		System.out.println("Remove value from index 2");
		al1.remove(2);
		System.out.println(al1);
		
		al1.remove(4);
		System.out.println(al1);
		
		System.out.println(al1.size());// find size of array list
		
		System.out.println(al1.isEmpty());// check the array list is empty or not
		
		System.out.println("Get all values using get method in for loop");
		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}

		System.out.println(al1.contains(40));
		System.out.println(al1.contains(400));

		ArrayList <Integer>al2=new ArrayList();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(500);
		al2.add(600);
		al2.add(700);
		System.out.println(al2);
		
		System.out.println("add one list to another");
		System.out.println(al1.addAll(al2));
		System.out.println(al1);
		al1.removeAll(al2);
		System.out.println(al1);
		
		al2.set(4, 3000);
		System.out.println(al2);
		
		//Iterator can use in both generic & non generic
		Iterator<Integer> it=al2.iterator();
		while(it.hasNext())//if there is element in list it will return true
		{
			System.out.println(it.next());
		}
		it.remove();// method to remove last element from array list
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println(al2);
	}

}
