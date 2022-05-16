import java.io.*;


public class Test{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a Number:: ");
        
        int n = Integer.parseInt(p.readLine());
        
        int pr;
        for(int i=1;i<=10;i++){
            
            pr = n*i;
            System.out.println(pr);
        }
    }
}