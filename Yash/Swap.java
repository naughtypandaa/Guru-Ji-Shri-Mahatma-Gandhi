import java.io.*;

public class Swap{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number of Elements of Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        System.out.println("Enter value of Kth Term:: ");
        int k = Integer.parseInt(p.readLine());
        int i;
        for( i=0;i<n;i++){
            arr[i] = Integer.parseInt(p.readLine());
        }
        
        double absolute = Math.abs(arr[k-1] - arr[n-k]);
        System.out.println("Absolute Value::"+absolute);
        
        int temp = arr[k-1];
        arr[k-1 ] = arr[n-k];
        arr[n-k] = temp;
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int l=0;
        int sl=0;
        for(i=0;i<n;i++){
            if(l<arr[i]){
                sl = l;
                l = arr[i];
            }
            else if((l>arr[i]) && (sl<arr[i])){
                sl = arr[i];
            }
        }
    }
}