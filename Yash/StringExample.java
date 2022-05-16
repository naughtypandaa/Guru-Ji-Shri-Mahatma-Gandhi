import java.io.*;

public class StringExample{
    public static void main(String args[]){
        
        String str = "HEllo Hi bye bye";
        String str1 = new String("Good Night");
        
        char cHAr[] = {'Y','a','s','h'};
        String str2 = new String(cHAr);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        
        char ch = str2.charAt(2);
        System.out.println(ch);
        
        int length = str2.length();
        System.out.println(length);
        
        int idx = str2.indexOf('Y');
        int idx2 = str.indexOf("bye");
        
        System.out.println(idx);
        System.out.println(idx2);
        
        int idx3 = str.lastIndexOf('h');
        System.out.println(idx3);
        
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        
        System.out.println(a==b);//true
        System.out.println(b==c);//false
        System.out.println(a==c);//false
        
        System.out.println(a.equals(b));//true
        System.out.println(b.equals(c));//true
        System.out.println(a.equals(c));//true
        
        String k =" KUSH ";
        String t =" kUSh ";
        
        System.out.println(k.equals(t));
        System.out.println(k.equalsIgnoreCase(t));
        
        String ta = "Yash";
        String n = "Yash";
        String i = "Yasx";
        
        System.out.println(ta.compareTo(n));
        System.out.println(n.compareTo(i));
        System.out.println(i.compareTo(ta));
        
        String y = " We must not allow other people’s limited perceptions to define us.";
        System.out.println(y.substring(0));
    }
}