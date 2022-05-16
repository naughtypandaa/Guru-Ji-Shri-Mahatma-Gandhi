import java.io.*;

public class Pattern2{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter number of stars:: ");
        int n = Integer.parseInt(p.readLine());
        int i;
        
        for(i=0;i<n;i++){
            horizontal(n);
            System.out.println();
        }
    }
    public void horizontal(int n){
        int i;
        for(i=0;i<n;i++){
            System.out.print("*");
        }
    }
    
}
