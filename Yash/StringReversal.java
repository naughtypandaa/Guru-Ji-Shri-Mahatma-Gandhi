import java.io.*;

public class StringReversal{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Statement:: ");
        String str = p.readLine();
        
        String revStr = "";
        int len = str.length();
        int i;
        String w;
        String r;
        w = "";
        r = "";
        for(i=0;i<len;i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                r = r + ch + w;
                w = "";
                
            }
            else{
                w = ch + w;
            }
        }
        System.out.println("Reversed Statement :: "+r);
    }
}