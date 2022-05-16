import java.io.*;

public class AverageSum{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[3][4];
        
        System.out.println("Enter Elements in array:: ");
        int i;
        int j;
        int sum = 0;
        double avg = 0;
        
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                arr[i][j] = Integer.parseInt(p.readLine());
                sum = sum + arr[i][j];
            }
        }
        avg = sum/12;
        System.out.println("Sum is:: "+sum);
        System.out.println("Average is:: "+avg);
    }
}