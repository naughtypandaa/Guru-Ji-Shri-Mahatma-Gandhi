import java.io.*;

public class AdamPrime{
    
    public int  reverse(int n){
        
        int rev = 0;
        
        for(;n!=0;n=n/10){
            int remainder = n%10;
            rev = rev*10+remainder;
        }
        return rev;
    }
    public boolean adamNo(int n){
        int square;

        square = n*n;
        int rev = reverse(n);
        int square2 = rev*rev;
        
        int reverse2 = reverse(n);
        
        if(square == square2){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean primeNumber(int n){
        int i;
        for(i=2;i<=n/2;i++){
            return true;
        }
        return false;
    }
    public static void main(String args[])throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Range:: ");
        int m;
        int n;
        m = Integer.parseInt(p.readLine());
        n = Integer.parseInt(p.readLine());
        int i;
        
        for(i=m;i<n;i++){
            ;
            
        }
    }
}