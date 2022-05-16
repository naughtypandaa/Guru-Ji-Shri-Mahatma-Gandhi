import java.io.*;

public class Fine{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Days Late:: ");
        int d = Integer.parseInt(p.readLine());
        
        int f;
        f = 0;
        
        if((d>=0) && (d<10)){
            f= f + 50;
            
        }
        else if((d>10) && (d<20)){
           f = f + 100; 
           
        }
        else if((d>20) && (d<30)){
            f = f + 150;

        }
        else if(d>30){
            f =  f + 300;
            
        }
        System.out.println("Fine:: "+f);
        System.out.println("Dil tod ke hansti ho mera,wafaayein meri yaad karogi.Jab duniyaa mein main na raha,toh kisey barbaad karogi?");
    }
}