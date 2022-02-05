package project06_collec;
import java.util .*; 
public class Hashprogram2 {
	public static void main(String args[]){  
	LinkedHashSet<String> set=new LinkedHashSet<String>();  
	set.add("nadeem");  
	set.add("asim");  
	set.add("nadeem");  
	set.add("athiq");  
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  
