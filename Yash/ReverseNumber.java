import java.io.*;

public class ReverseNumber {
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the number that has to be Reversed");
        int n = Integer.parseInt(p.readLine());
        int reverse = reverseNumber(n);
        System.out.print("Reversed Number Is:: "+reverse);
        if(reverse==n){
            System.out.println("The following no. is a palindrone Number");
        }
        else{
            System.out.println("The Number is not palindrone");
        }
    }
    public int reverseNumber(int n){
        int reverse;
        reverse = 0;
        for(;n!=0;n=n/10){
            int r=n%10;
            reverse = reverse*10+r;
        }
        return reverse;
        
    }
}