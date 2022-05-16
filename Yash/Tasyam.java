import java.io.*;

public class Tasyam{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of Stars::");
        
        int n = Integer.parseInt(p.readLine());
        char ch = '+';
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                ch = ' ';
                if((i == 1) || (i == n)){
                    ch = '*';
                }
                else if((j == 1) || (j == n)){
                    ch = '*';
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}