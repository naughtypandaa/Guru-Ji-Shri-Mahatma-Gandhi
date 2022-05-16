import java.io.*;

public class Diamond{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the Number of Elements For the Pattern:: ");
        int n = Integer.parseInt(p.readLine());
        
        pattern1(n);
    }
    public void pattern1(int n){
        /*  + 
           + + 
          + + + 
         + + + + 
        + + + + + 
         * * * * 
          * * * 
           * * 
            * */
        int r;
        int c;
        for(r=1;r<=n;r++){
            for(c=n-1;c>=r;c--){
                System.out.print(" ");
            }
            for(c=1;c<=r;c++){
                System.out.print("+ ");
            }
            System.out.println();
        }
        for(r=1;r<=n-1;r++){
            for(c=1;c<=r;c++){
                System.out.print(" ");
            }
            for(c=n-1;c>=r;c--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}