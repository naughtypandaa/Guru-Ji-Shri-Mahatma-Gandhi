import java.io.*;

public class VowelCount{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Statement:: ");
        String str = p.readLine();
        
        int len = str.length();
        int i;
        
        int count;
        count = 0;
        
        for(i=0;i<len;i++){
            char ch = str.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1){
                count++;
            }
        }
        System.out.println("Number of vowels in our statement is "+count);
    }
}