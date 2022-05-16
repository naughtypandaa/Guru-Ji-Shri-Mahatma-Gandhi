import java.io.*;

public class ArmstrongNumber{
    public void main()throws IOException{
        BufferedReader p  =  new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a Number:: ");
        int n = Integer.parseInt(p.readLine());
        int value = armstrongNumber(n);
        if(value == n){
            System.out.println(n+" is a Armstrong Number ");
        }
        else{
            System.out.println(n+" is not a Armstrong Number");
        }
    }
    public int  armstrongNumber(int n){
        int sum= 0;
        for(;n!=0;n=n/10){
            int r = n%10;
            sum = sum+(r*r*r);
        }
        return sum;
    }
}