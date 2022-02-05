package project02_Accessmod;

class Data {
    private String name;
    public String getName() {
        return this.name;
    }
   
    public void setName(String name) {
        this.name= name;
    }
}
public class D2 {
    public static void main(String[] main){
        Data d = new Data();

        d.setName("nadeem");
        System.out.println(d.getName());
    }
}