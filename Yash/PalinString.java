import java.io.*;

public class PalinString{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a Statement:: ");
        String str = p.readLine();
        
        String revStr = "";
        int len;
        len = str.length();
        int i;
        
        for(i=0;i<len;i++){
             char ch = str.charAt(i);
             revStr = ch + revStr;
        }
        System.out.println("Reveresed String is::"+revStr);
        
        if(str.equalsIgnoreCase(revStr)){
            System.out.println("String is Palidrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}