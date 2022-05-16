import java.io.*;

public class BhaiLang{
    public static void main(String args[])throws IOException{
        
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:: ");
        String str = p.readLine();
        
        int len = str.length();
        
        int firstSpace = str.indexOf("  ");
        int lastSpace = str.lastIndexOf("   ");
        
        String firstword = str.substring(0,firstSpace);
        
        String lastWord = str.substring(lastSpace+1,len);
        
        String RemainingWord = str.substring(firstSpace+1,lastSpace);
        
        System.out.println(lastWord+" "+RemainingWord+" "+firstword);
    }
}