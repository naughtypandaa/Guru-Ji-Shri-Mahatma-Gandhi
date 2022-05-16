import java.io.*;
import java.io.BufferedReader;

public class LeftDiagonal{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[4][4];
        System.out.println("Enter Elements in array:: ");
        int i;
        int j;
        int sum;
        sum = 0;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                arr[i][j] = Integer.parseInt(p.readLine());
                if(i == j){
                    sum = sum+arr[i][j];
                }
            }
        }
        System.out.println("Sum of left Diagonal:: "+sum);
    }
}