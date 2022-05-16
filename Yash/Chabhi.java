import java.io.*;

public class Chabhi{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Elements of Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        System.out.println("Array is:: ");
        int i;
        for(i=0;i<n;i++){
            arr[i] = Integer.parseInt(p.readLine());
            System.out.println(arr[i]+" ,");
        }
        System.out.println("Enter Element that has to be Searched:: ");
        int x = Integer.parseInt(p.readLine());
        
        for(i=0;i<n;i++){
            if(arr[i] == x){
                System.out.println("Number "+x+" is present at index "+i+" . ");
                break ;
            }
            
        }
        if(i == n){
                System.out.println("Sorry! Hum aapka Number nhi bacha sakee ");
            }
        for(i=n-1;i>=0;i--){
            if(arr[i] == x){
                System.out.println("Number "+x+" is present at index "+i+" . ");
                break ;
            }
            
        }
        if(i == -1){
                System.out.println("Sorry! Hum aapka Number nhi bacha sakee ");
            }
    }
}