import java.io.*;

public class SelectionSortPattern {
    public static void main(String args[])throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements in the array:: ");
        int n;
        n = Integer.parseInt(p.readLine());
        int arr[] = new int[n];
        int i;
        int j;
        for(i=0;i<n;i++){
            System.out.println(i);
        
        
            for(j=i+1;j<n;j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}