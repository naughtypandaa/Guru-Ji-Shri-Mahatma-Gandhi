import java.io.*;

public class AscendingSelectionSort {
    public static void main(String args[])throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements in the array:: ");
        int n;
        n = Integer.parseInt(p.readLine());
        int arr[] = new int[n];
        int i;
        int j;
        for(i=0;i<n;i++){
            System.out.println("Enter a no. at index "+i);
            arr[i] = Integer.parseInt(p.readLine());
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
            if(arr[j]<arr[i]){
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
            }
        }
        System.out.println("After Selection sorting ::");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
    }
}