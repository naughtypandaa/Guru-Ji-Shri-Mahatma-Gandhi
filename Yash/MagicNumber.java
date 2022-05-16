import java.io.*;

public class MagicNumber{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:: ");
        int num = Integer.parseInt(p.readLine());
        int value  = magicNumber(num);
        if(value == 1){
            System.out.print(num+" is a Magic Number.");
        }
        else{
            System.out.print(num+" is not a Magic Number");
        }
    }
    public int magicNumber(int num){
        int r;
        int sum = 0;
        for(;num!=0;num=num/10){
            if(num==0){
                num = sum;
                sum = 0;
            }
            r=num%10;
            sum = sum+r;
        }
        return sum;
    }
}