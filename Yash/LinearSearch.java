import java.io.*;

public class LinearSearch{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Elements of Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println("Enter a Number at index:: "+i);
            arr[i] = Integer.parseInt(p.readLine());
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] == n){
                System.out.println("The number is present in the index");
                break;
            }
        }
        if(i == arr.length){
            System.out.println("The number is not present in the array");
        }
    }
}