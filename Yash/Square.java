import java.io.*;

public class Square{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter number of stars:: ");
        int n = Integer.parseInt(p.readLine());
        square(n);
    }
    public void square(int n){
        int i;
        int j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}