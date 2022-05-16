import java.io.*;

public class BubbleSortingAscending{
    public static void main(String argss[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Elements Of Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        int i;
        
        for(i=0;i<n;i++){
            System.out.println("Enter a number at Index:: "+i);
            arr[i] = Integer.parseInt(p.readLine());
        }
        int j;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1;j++){
                if(arr[j+1]<arr[j]){
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