import java.io.*;
import java.io.BufferedReader;

public class RecurFact{
    public static  void main(String args[])throws IOException{
        
        RecurFact obj = new RecurFact();
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an Number:: ");
        int n = Integer.parseInt(p.readLine());
        
        
        
        
        System.out.println("Facctorial of"+n+"is"+obj.fact(n));
    }
    public int fact(int n){
        if(n == 0){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
}