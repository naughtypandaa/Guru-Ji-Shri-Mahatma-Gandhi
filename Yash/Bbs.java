import java.io.*;

public class Bbs{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Elements");
        int n = Integer.parseInt(p.readLine());
        
        int i;
        int j;
        
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            
                arr[i] = Integer.parseInt(p.readLine());
            
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    arr[j+1] = arr[j] + arr[j+1];
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] + arr[j+1];
                }
            }
        }
    }
}