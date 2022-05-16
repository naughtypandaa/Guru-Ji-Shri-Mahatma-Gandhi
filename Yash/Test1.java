import java.io.*;

public class Test1{
    public void main()throws IOException{
        
         BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Kuch bhi Daal Do:: ");
         int n = Integer.parseInt(p.readLine());
         
         pattern1(n);
         pattern2(n);
         pattern3(n);
    }
    public void pattern1(int n){
        int r;
        int c;
        for(r=1;r<=n;r++){
            for(c=n-1;c>=r;c--){
                System.out.print(" ");
            }
            for(c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        int i;
        int j;
        int b=16;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(b+" ");
                b=b+4;
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        int r;
        int c;
        
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++){
                    
                if((r==1) || (r==n)){
                    System.out.print(r);
                }
                else if((c==1) || (c==n)){
                    System.out.print(r);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}