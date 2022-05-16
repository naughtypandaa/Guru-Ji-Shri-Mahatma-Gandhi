import java.io.*;

public class Array{
    public static void main(String args[])throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Elements of Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++){
            System.out.print("Enter a number at index:: "+i);
            arr[i] = Integer.parseInt(p.readLine());
        }
    }
}