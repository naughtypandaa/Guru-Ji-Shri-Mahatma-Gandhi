import java.io.*;

public class Conversion{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a String:: ");
        String str = p.readLine();
        
        int len = str.length();
        int i;
        String w = "";
        int wn;
        for(i=0;i<len;i++){
            
            char ch = str.charAt(i);
            w = w+ch;
            wn = Integer.parseInt(w);
            if((wn>= 65 && wn<=90) ||(wn>=97 && wn<=122) || (wn>=48 && wn<=57) || (wn == 32) ){
                System.out.println((char)wn);
                w = ""; 
            }
        }
    }
}