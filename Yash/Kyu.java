import java.io.*;

public class Kyu{
    public static void main() throws IOException {
        
        Kyu obj = new Kyu();
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number Of Terms::");
        int n = Integer.parseInt(p.readLine());
        
        for(int i=1;i<n;i++){
            int f = obj.fibo(n);
            System.out.println(f+" ");
        }
    }
    public int fibo(int n){
        
        if(n==1){
            System.out.println(0);
            return 0;
        }
        else if(n == 2){
            System.out.println(1);
            return 1;
        }
        else{
            int x = (fibo(n-1) + fibo(n-2));
            System.out.println(x);
            return x;
        }
    }
}