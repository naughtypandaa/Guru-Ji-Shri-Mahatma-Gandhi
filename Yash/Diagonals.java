import java.io.*;

public class Diagonals{
    public void main()throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of stars:: ");
        int n= Integer.parseInt(p.readLine());
        
    }
    public void Diagonals(int n){
        char ch;
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                ch = '+';
                if(i==j){
                    ch = '*';
                }
                else if((i+j)==(n+1)){
                    ch = '*';
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}