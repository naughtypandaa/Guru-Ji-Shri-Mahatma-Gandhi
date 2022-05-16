import java.io.*;

public class Yash{
    public static void main(String args[])throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a Number:: ");
        int n = Integer.parseInt(p.readLine());
        
        
        System.out.println("Enter Value of x:: ");
        int x = Integer.parseInt(p.readLine());
        
        Yash obj = new Yash();
        
        System.out.println("Sum:: "+obj.func(n));
        
        
    }
    public int func(int n){
       int sum = 0;
       if(n == 1){
           return 1;
       }
       else{
           if(n%2 == 0){
               sum = func(n-1) - n;
           }
           else{
               sum = func(n-1) +n;
           }
           return sum;
       }
    }
    public int func2(int n,int x){
        int sum = 0;
        if(n==1){
            return x;
        }
        else{
            if(n%2==0){
                sum = 
            }
        }
    }
}