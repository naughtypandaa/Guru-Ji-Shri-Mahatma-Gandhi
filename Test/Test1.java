import java.io.*;
import java.io.BufferedReader;

public class Test1{
    public void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number of Elements in the Array:: ");
        int n = Integer.parseInt(p.readLine());
        
        System.out.println("Enter the Number that has to be Searched::");
        int x = Integer.parseInt(p.readLine());
        
        int arr[] = new int[n];
        
        int i;
        for(i=0;i<n;i++){
            System.out.println("Enter Element at Index "+i);
            arr[i] = Integer.parseInt(p.readLine());
        }
        
        bubbleSort(arr, n);
        linearSearch(arr,x);
        SelectionSortDescending(arr,n);
    }
    public void bubbleSort(int arr[],int n){
        int j;
        int i;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1;j++){
                if(arr[j+1]<arr[j]){
                    arr[j+1] = arr[j] + arr[j+1];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                }
            }
        }
        System.out.println("Sorted Array is::");
        for(i=0;i<n;i++){
            System.out.println(arr[i]+" , ");
        }
        return ;
    }
    public void linearSearch(int arr[],int x){
        int i;
        int n = arr.length;
        for(i=0;i<n;i++){
            if(arr[i] == x){
                System.out.println("The Element "+x+" is present at Index"+i);
                break;
            }
        }
        if(i == n){
            System.out.println("Bura Hua aapka Number Humhare pass nhi hai.");
        }
        
    }
    public void binarySearch(int arr[],int n){
        int l=0;
        int i;
        int u = n-1;
        
        while(l<u){
            
        }
    }
    public void SelectionSortDescending(int arr[],int n){
        int j;
        int i;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is::");
        for(i=0;i<n;i++){
            System.out.println(arr[i]+" , ");
        }
        return ;
    }
}