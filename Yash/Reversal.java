import java.io.*;

public class Reversal{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Statement:: ");
        String str = p.readLine();
        String revStr = "";
        int len = str.length();
        int i;
        int count;
        count = 0;
        
        for(i=0;i<len;i++){
            char ch = str.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println("Reversed String "+revStr);
    }
}