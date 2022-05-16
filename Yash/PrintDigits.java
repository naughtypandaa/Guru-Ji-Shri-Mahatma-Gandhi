import java.io.*;

public class PrintDigits{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a Number:: ");
        int a = Integer.parseInt(p.readLine());
        printDigit(a);
    }
    public void printDigit(int n){
        for(;n!=0;n=n/10){
            int r=n%10;
            System.out.println(r);
        }
    }
}