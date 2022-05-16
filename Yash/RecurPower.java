import java.io.*;
import java.io.BufferedReader;

public class RecurPower{
    public static  void main(String args[])throws IOException{
        
        RecurPower obj = new RecurPower();
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an Number:: ");
        int n = Integer.parseInt(p.readLine());
        
        System.out.println("Enter value for power:: ");
        int a = Integer.parseInt(p.readLine());
        
        int check = obj.pow(n,a);
        System.out.println(n+" ^ "+a+" is "+check );
    }
    public int pow(int n,int a){
        if(a == 1){
            return n;
        }
        else{
            return (n*pow(n,a-1));
        }
    }
}