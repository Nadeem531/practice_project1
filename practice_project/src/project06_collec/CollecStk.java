package project06_collec;

import java.util.*;  
public class CollecStk{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("1");  
stack.push("2");  
stack.push("3");  
stack.push("4");  
stack.push("5");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
