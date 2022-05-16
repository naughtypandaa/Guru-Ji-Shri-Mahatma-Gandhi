import java.io.*;

public class Absolute{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number of Elements of Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        System.out.println("Enter value of Kth Term:: ");
        int k = Integer.parseInt(p.readLine());
        
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(p.readLine());
        }
        
        double absolute = Math.abs(arr[k-1] - arr[n-k]);
        System.out.println("Absolute Value::"+absolute);
    }
}