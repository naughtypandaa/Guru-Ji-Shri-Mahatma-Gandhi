import java.io.*;

public class Mobile{
    String company;
    String modelNumber;
    int price;
    public static void main(String args[]){
        
        //BufferedReader p = new BufferedReader (new InputStreamReader(System.in));
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();
        
        mobile1.company = " Apple ";
        mobile2.company = " Google ";
        
        mobile1.modelNumber = " iphone 13 ";
        mobile2.modelNumber = " Pixel 6Pro ";
        
        mobile1.price = 79990;
        mobile2.price = 75000;
        
        mobile2.comparision(mobile1);
    }
    public void comparision(Mobile mobile){
        if(mobile.price > this.price){
            System.out.println(this.company);
            System.out.println(this.modelNumber);
        }
        else{
            System.out.println(mobile.company);
            System.out.println(mobile.modelNumber);
        }
    }
}