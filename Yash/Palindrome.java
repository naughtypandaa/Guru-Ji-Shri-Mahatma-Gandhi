
//check if all the elements in an array are palindrome

import java.io.*;

public class Palindrome{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number Of Elements Of Array::");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        int i;
        int temp;
        int rev = 0;
        int r;
        int count = 0;
        
        for(i=0;i<n;i++){
            arr[i] = Integer.parseInt(p.readLine());
        }
        for(i=0;i<n;i++){
            temp = arr[i];
            rev = 0;
            while(temp!=0){
                r =temp%10;
                rev = (rev*10)+r;
                temp = temp/10;
                
                
            }
            if(arr[i] == rev){
                count++;
            }
            
        }
        if(count == n){
            System.out.println("Not all Elements are Palindrome");
        }
        else{
            System.out.println("All Elements are Palindrome");
        }
    }
}