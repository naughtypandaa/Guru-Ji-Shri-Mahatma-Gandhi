import java.io.*;

public class Pattern1{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter number of stars:: ");
        int n = Integer.parseInt(p.readLine());
        vertical(n);
        horizontal(n);
    }
    public void vertical(int n){
        int i;
        for(i=0;i<n;i++){
            System.out.println("*");
        }
    }
    public void horizontal(int n){
        int i;
        for(i=0;i<n;i++){
            System.out.print("*");
        }
    }
}