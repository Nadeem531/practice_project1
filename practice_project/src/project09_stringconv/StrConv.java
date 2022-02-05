package project09_stringconv;

public class StrConv {
    public static void main(String args[]){
         
         
         String st1 = "This is String 1.";
         String st2 = "This is String 2.";

       
         StringBuffer sbuf = new StringBuffer();
         sbuf.append(st1);
         sbuf.append(st2);
         System.out.println("string to string buffer using append is: "+sbuf);

         
         StringBuilder sbuld= new StringBuilder();
         sbuld.append(st1);
         sbuld.append(st2);
         System.out.println("string to string builder using append is: "+sbuld);
    }
}