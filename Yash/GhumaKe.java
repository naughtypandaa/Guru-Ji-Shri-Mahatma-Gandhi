import java.io.*;

public class GhumaKe{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:: ");
        String str = p.readLine();
        
        int  len = str.length();
        
        String s = "";
        int ns;
        int i;
        for(i=len-1;i>=0;i--){
            
            char ch = str.charAt(i);
            s = s+ch;
            ns = Integer.parseInt(s);
            if((ns>=65 && ns<=90) || (ns>=97 && ns<=122) || (ns>=49 && ns<57) || (ns == 32) ){
                System.out.println((char)ns);
                s = "";
            }
        }
    }
}