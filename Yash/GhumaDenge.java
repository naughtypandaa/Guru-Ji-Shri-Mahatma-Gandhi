import java.io.*;

public class GhumaDenge{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number of Elements in Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        
        
        
        System.out.println("Enter number of time rotation has to be Performed:: ");
        int r = Integer.parseInt(p.readLine());
        
        r = r%n;
        int i = 0;
        System.out.println("Array is:: ");
        while(i<n){
            arr[i] = Integer.parseInt(p.readLine());
            System.out.println(arr[i]+" ");
            i++;
        }
        int newArr[] = new int[n];
        for(i=0;i<n;i++){
            
            newArr[(i+r)%n] = arr[i];
            
        }
        System.out.println("Ghumai Hui Array:: ");
        for(i=0;i<n;i++){
            System.out.println(newArr[i]);
        }
    }
}