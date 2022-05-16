import java.io.*;

public class BucketSort{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Elements:: ");
        int n = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        int i;
        int count[] = new int[101];
        
        for(i=0;i<n;i++){
            arr[i] = Integer.parseInt(p.readLine());
        }
        for(i=0;i<n;i++){
            count[(arr[i])]++;
        }
        for(i=0;i<101;i++){
            System.out.println(i+":: "+count[i]);
            
        }
        for(i=0;i<101;i++){
            for(int j = 0;j<count[i];j++){
                System.out.println(i);
            }
        }
    }
}