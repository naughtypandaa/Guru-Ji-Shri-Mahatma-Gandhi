import java.io.*;

public class Triangle2{
    public void main()throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number of Elements:: ");
        int n = Integer.parseInt(p.readLine());
        
        
        pattern2(n);
        
    }
    public void pattern1(int n){
        //++++*
        //+++**
        //++***
        //+****
        //*****
        
        int r;
        int c;
        for(r=1;r<=n;r++){
            for(c=n-1;c>=r;c--){
                System.out.print("+");
            }
            for(c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        //    *
        //   **
        //  ***
        // ****
        //*****
        int r;
        int c;
        for(r=1;r<=n;r++){
            for(c=n-1;c>=r;c--){
                System.out.print(" ");
            }
            for(c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        //    1
        //   22
        //  333
        // 4444
        //55555
        int r;
        int c;
        for(r=1;r<=n;r++){
            for(c=n-1;c>=r;c--){
                System.out.print(" ");
            }
            for(c=1;c<=r;c++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        //     5
        //    44
        //   333
        //  2222
        // 11111
        int r;
        int c;
        for(r=1;r<=n;r++){
            for(c=n-1;c>=r;c--){
                System.out.print(" ");
            }
            for(c=1;c<=r;c++){
                System.out.print(n-r+1);
            }
            System.out.println();
        }
    }
    public void pattern5(int n){
        //    1
        //   23
        //  456
        // 78910
        //1112131415
        
        int r;
        int c;
        int k = 1;
        for(r=1;r<=n;r++){
            for(c=n-1;c>=r;c--){
                System.out.print("\t");
            }
            for(c=1;c<=r;c++){
                System.out.print(k+++"\t");
            }
            System.out.println();
        }
    }
    public void pattern6(int n){
        //    1
        //   21
        //  321
        // 4321
        //54321
        int r;
        int c; 
        for(r=1;r<=n;r++){
        for(c=n-1;c>=r;c--){
            System.out.print(" ");   
        }
            for(c=r;c>=1;c--){
                System.out.print(c);
        }
        System.out.println();
    }
    }
    public void pattern7(int n){
        
    }
    public void pattern8(int n){
        
    }
    public void pattern9(int n){
        
    }
}