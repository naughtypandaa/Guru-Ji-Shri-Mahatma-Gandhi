import java.io.*;

public class OppositeTriangle{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter number of stars:: ");
        int n = Integer.parseInt(p.readLine());
        
        triangle1(n);
        triangle2(n);
        triangle3(n);
        triangle4(n);
        triangle5(n);
        triangle6(n);
    }
    public void triangle1(int n){
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void triangle2(int n){
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void triangle3(int n){
        int i;
        int j;
        for(i=1;i>=n;i--){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void triangle4(int n){
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
    public void triangle5(int n){
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void triangle6(int n){
        int i;
        int j;
        int k;
        k = 1;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}