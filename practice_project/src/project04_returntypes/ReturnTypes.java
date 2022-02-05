package project04_returntypes;



public class ReturnTypes{
    void method1(){
        System.out.println("this is from method1 of void return type");
    }
    
    int method2(){
        
       
        int value= 1;
        return value;
    }
    
    double method3(){
     
        double value= 1.0;
        return value;
    }
    
    boolean method4(){
        
        boolean value= true;
        return value;
    }
    String method5(){
        String value = "string1";
        return value;
    }



   
    public static void main(String args[]) {
    ReturnTypes s = new ReturnTypes();
      s.method1();
      System.out.println(s.method2());
      System.out.println(s.method3());
      System.out.println(s.method4());
      System.out.println(s.method5());
    }
}



