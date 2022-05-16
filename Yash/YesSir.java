import java.io.*;

public class YesSir{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a Statement:: ");
        String str = p.readLine();
        
         str = str+"";
        int len;
        len = str.length();
        int i;
        String num;
        num = " ";
        for(i=0;i<len;i++){
            char ch = str.charAt(i);
            
            if((ch>='0')  && (ch<='9')){
                
                num = num+ch;
                
            }
            else{
                System.out.println(num);
                num = "";
            }
        }
        if(!num.equals("")){
            System.out.println(num);
        }
    }
}