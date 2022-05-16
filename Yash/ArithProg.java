import java.io.*;

public class ArithProg{
    public static void main(String args[])throws IOException{
        
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter First Term:: ");
        int a = Integer.parseInt(p.readLine());
        
        System.out.println("Enter Common Differnce:: ");
        int d = Integer.parseInt(p.readLine());
        
        System.out.println("Enter Number Of Terms:: ");
        int n = Integer.parseInt(p.readLine());
        
        int i;
        for(i=0;i<n;i++){
            
             System.out.println(a+(i-1)*d);   
        
            }
    }
}