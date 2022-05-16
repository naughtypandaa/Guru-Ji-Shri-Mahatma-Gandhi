import java.io.*;

public class MaximumMinimum{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements of array:: ");
        int n= Integer.parseInt(p.readLine());
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++){
            System.out.println("Enter a Number at index:: "+i);
            arr[i] = Integer.parseInt(p.readLine());
        }
        int max;
        int min;
        max = arr[0];
        min = arr[0];
        for(i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            }
        System.out.println("Maximum Number is:: "+max);
        System.out.println("Minimum Number is:: "+min);
        }
    }
