import java.io.*;

public class Rotation{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of elements of array:: ");
        int n;
        n = Integer.parseInt(p.readLine());
        System.out.print("Enter the Number of Times The rotation has to be performed:: ");
        int k;
        k = Integer.parseInt(p.readLine());
        k = k%n;
        int arr[] = new int[n];
        int i;
        i = 0;
        while(i<n){
            arr[i] = Integer.parseInt(p.readLine());
            System.out.println(arr[i]+" ");
            i++;
        }
        int newArr[] = new int[n];
        for(i=0;i<n;i++){
            newArr[(i+k)%n] = arr[i];
        }
        System.out.println("Rotated Array is:: ");
        for(i=0;i<n;i++){
            System.out.println(newArr[i]);
        }
    }
}