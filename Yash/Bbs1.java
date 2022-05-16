import java.io.*;

public class Bbs1{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Elements Of Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        int i;
        int j;
        for(i=0;i<n;i++){
            System.out.println("Enter a number at Index:: "+i);
            arr[i] = Integer.parseInt(p.readLine());
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j+1]>arr[j]){
                    arr[j+1] = arr[j] + arr[j+1];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                }
            }
        }
        System.out.println("Sorted Array is ");
        for(i=0;i<n;i++){
            
            System.out.print(arr[i]+" ,");
        }
    }
}