import java.io.*;

public class LinearSearch1{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = {22,54,85,36,47,20214,879};
        
        System.out.print("Enter the number that has to be Searched:: ");
        int n = Integer.parseInt(p.readLine());
        int i;
        
        for(i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("The number "+n+" is present at index "+arr[i]+" of the following array");
                break;
            }
        }
        if(i==arr.length){
            System.out.println("Bura hua apka number humhare pass nhi hai");
        }
    }
}