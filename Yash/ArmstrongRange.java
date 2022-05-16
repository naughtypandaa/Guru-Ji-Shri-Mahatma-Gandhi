import java.io.*;

public class ArmstrongRange{
    public void main(){
        int value;int i;
        for(i=1;i<=1000;i++){
            value = armstrongNumber(i);
            if(value==i){
                System.out.println(i);
            }
        }
    }
    public int armstrongNumber(int n){
        int r;
        int sum = 0;
        for(;n!=0;n=n/10){
            r = n%10;
            sum = sum+(r*r*r);
            n = n/10;
        }
        return sum;
    }
}