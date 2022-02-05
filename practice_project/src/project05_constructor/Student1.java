package project05_constructor;
public class Student1 {  
    int id;  
    String name;  
   
    Student1(int i,String n){  
    id = i;  
    name = n;  
    }  
 
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
 
    Student1 s1 = new Student1(111,"nadeem");  
    Student1 s2 = new Student1(222,"asim");  
   
    s1.display();  
    s2.display();  
   }  


}
