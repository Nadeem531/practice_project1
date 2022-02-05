package project06_collec;
import java.util.*;

public class Array {
	
		public static void main(String[] args)
		{

			ArrayList<Integer> al = new ArrayList<Integer>();		
			for (int i = 3; i <= 4; i++)
				al.add(i);
			System.out.println(al);		
			al.remove(3);
			System.out.println(al);
			for (int i = 0; i < al.size(); i++)
				System.out.print(al.get(i) + " ");
		}
	}
