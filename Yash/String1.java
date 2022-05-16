import java.io.*;

public class String1{
    public static void main(String args[])throws IOException{
     
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word:: ");
        String w = p.readLine();
        
        int l = w.length();
        int i;
        for(i=0;i<l;i++){
            System.out.println(w.charAt(i));
        }
    }
}