package project06_collec;
import java.util.*;  
class Sorting{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
        al.add("hrithik");    
        al.add("amir");    
        al.add("sharukh");    
        al.add("salman");   
          
        Collections.sort(al,Collections.reverseOrder());  
        Iterator<String> i=al.iterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
}  
}  
	 