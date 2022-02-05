package project06_collec;
import java.util.*;  
public class Hashprogram1 {
 
	public static void main(String args[]){  
	
	HashSet<String> set=new HashSet<String>();  
	set.add("nadeem");  
	set.add("asim");  
	set.add("athiq");  
	set.add("nadeem");  
	set.add("athiq") ; 
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  
