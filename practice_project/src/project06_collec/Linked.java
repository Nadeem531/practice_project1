package project06_collec;


import java.util.*;

class Linked {  
	
	public static void main(String[] args)
	{

		
		LinkedList<Integer> ll = new LinkedList<Integer>();		
		for (int i = 2; i <= 5; i++)
		     ll.add(i);
		System.out.println(ll);
		ll.remove(3);		
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++)
                 System.out.print(ll.get(i) + " ");
	}
}