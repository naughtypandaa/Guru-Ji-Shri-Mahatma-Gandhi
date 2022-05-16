import java.io.*;

public class Test2{
    public void main() throws IOException{
        
        BufferedReader p = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("Enter the value");
        int n = Integer.parseInt(p.readLine());
        
        pattern(n);
    }
    public void pattern(int n){
        int r;
        int c;
        int y;
        for(r=1;r<=n;r++){
             for(c=n-1;c>=r;c--){
                 System.out.print(" ");
             }
             for(c=1;c<=r;c++){
                 y = r%2;
                 if(y== 0){
                     System.out.print("2 ");
                 }
                 else{
                 System.out.print("1 ");
                 }
             }
             System.out.println();
         }
    }
}