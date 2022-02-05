package project01_pre_datatype;

import java.util.*;  
public class Premitive {
    public static int toInt(String s) {
    return Integer.parseInt(s);
    }
    
    public static double toDouble(String s) {
    return Double.parseDouble(s);
    }
    
    public static long toLong(String s) {
    return Long.parseLong(s);
    }
    public static boolean toboolean(String s) {
    return Boolean.parseBoolean(s);
    }
    
    public static void main(String args[]) {
      int i;
      double j;
      long l;
      boolean b;
      
      try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter input");
		  String str= sc.nextLine();
		  
		  
		  i = toInt(str);
		  System.out.println("converted to int: "+i);
		  
		  j = toDouble(str);
		  System.out.println("converted to double: "+j);
		  
		  l= toLong(str);
		  System.out.println("converted to double: "+l);
		 
		  b= toboolean(str);
	}
      System.out.println("converted to double: "+b);
      
    }
}
