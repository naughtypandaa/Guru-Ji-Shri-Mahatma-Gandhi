import java.io.*;

public class ArrayPalin{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number Of Elements Of Array::");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        int i;
        int count = 0;
        
        System.out.println("Original Array::");
        for(i=0;i<n;i++){
            arr[i] = Integer.parseInt(p.readLine());
            
        }
        
        for(i=0;i<n/2;i++){
            if(arr[i] == arr[n]){
                
                count ++;
                
            }
            
        }
        if(count == n/2){
            System.out.println("Palindrome");
        }
        else{
           System.out.println("Not Palindrome"); 
        }
        
    }
}