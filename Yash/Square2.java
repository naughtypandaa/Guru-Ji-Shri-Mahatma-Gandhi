import java.io.*;

public class Square2{
    public void main()throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of stars:: ");
        int n= Integer.parseInt(p.readLine());
        
        
    }
    public void hollow(int n){
        char ch;
        ch = '*';
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                ch = ' ';    
                if((i==1) || (i==n)){
                    ch = '*';
                }
                else if((j==1) || (j==n)){
                    ch = '*';
                }
                System.out.print(ch);
                
            }
            System.out.println();
        }
    }
}