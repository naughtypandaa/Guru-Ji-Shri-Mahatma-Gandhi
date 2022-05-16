import java.util.*;
class worldwise
{
    String str;
    worldwise()
    {
        str="";
    }
    void readsent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.nextLine();
    }
    int freqvowel(String w)
    {
        int i;
        int c=0;
        for(i=0;i<w.length();i++)
        {
            if("AEIOU".indexOf(w.charAt(i))>=0)
            c++;
        }
        return c;
    }
    void arrange()
    {
        int i;
        StringTokenizer st=new StringTokenizer(str);
        int c=st.countTokens();
        System.out.println("Word \t Vowel");
        for(i=1;i<=c;i++){
        
            String wd =st.nextToken();
            int v=freqvowel(wd);
            System.out.println(wd +"\t"+v);
        
    }
    }
    public static void main(String args[])
    {
        worldwise obj=new worldwise();
        obj.readsent();
        obj.arrange();
    }
}