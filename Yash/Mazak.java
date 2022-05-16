import java.io.*;

public class Mazak{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of Elements in the Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        
        System.out.println("Array is::");
        int i;
        int j;
        
        for(i=0;i<n;i++){
            arr[i] = Integer.parseInt(p.readLine());
        }
        int temp = 0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is:: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" , ");
        }
        if(n%2 == 0){
            System.out.println("Remaining Term:: "+arr[(n/2)-1]);
        }
        else if(n%2 != 0){
            System.out.println("Remaining Term:: "+arr[((n+1)/2)-1]);
        }
        
    }
}