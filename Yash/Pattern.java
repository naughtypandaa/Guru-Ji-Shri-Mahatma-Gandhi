import java.io.*;

public class Pattern{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Number:: ");
        int n = Integer.parseInt(p.readLine());
        
        int i;
        int j;
        for(i=0;i<n-1;i++){
            System.out.println(i);
            
            for(j=i;j<=n;j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}