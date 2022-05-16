import java.io.*;

public class MagicRange{
    public void main()throws IOException{
        
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