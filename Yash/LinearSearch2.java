import java.io.*;

public class LinearSearch2{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = {22,54,85,36,47,20214,879};
        
        System.out.print("Enter the number that has to be Searched:: ");
        int n = Integer.parseInt(p.readLine());
        int i;
        int c;
        c = 0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("The number "+n+" is present at index "+arr[i]+" of the following array");
                c++;
            }
        }
        if(c==0){
            System.out.println("Number not Present");
        }
        else{
            System.out.println("Number of occurence"+c);
        }
    }
}