import java.io.*;

public  class Cases{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a String:: ");
        String s = p.readLine();
        
        int l = s.length();
        int uc=0,lc=0,sc=0,d=0;
        char temp;
        int i;
        for(i=0;i<l;i++){
            temp = s.charAt(i);
            if(temp>='a' && temp<='z'){
                lc++;
            }
            else if(temp>='A' && temp<='Z'){
                uc++;
            }
            else if(temp>='0' && temp<='9'){
                d++;
            }
            else{
                sc++;
            }
        }
        System.out.println("Number of upper case characters:: "+uc);
        System.out.println("Number of lower case characters:: "+lc);
        System.out.println("Number of special case characters:: "+sc);
        System.out.println("Number of digits in the string "+d);
    }
}