import java.io.*;

public class PascalTriangle{
    public void main()throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a Value:: ");
        int n;
        n = Integer.parseInt(p.readLine());
        factorial(n);
        pattern1(n);
    }
    public int factorial(int n){
        int f;
        int i;
        f=1;
        for(i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public void pattern1(int n){
        int r;
        int c;
        int combination;
        for(r=0;r<=n;r++){
            for(c=n-1;c>=r;c--){
                System.out.print("  ");
            }
            for(c=0;c<=r;c++){
                combination = factorial(r)/(factorial(c)*factorial(r-c));
                System.out.print(combination+"  ");
            }
            System.out.println();
        }
    }
}