package project06_collec;

import java.util.*;  
public class CollecVec {  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("car");  
v.add("bus");  
v.add("auto");  
v.add("train");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  