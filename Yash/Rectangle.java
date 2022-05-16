import java.io.*;

public class Rectangle{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Number of Rows:: ");
        int r = Integer.parseInt(p.readLine());
        
        System.out.print("Enter Number of Columns:: ");
        int c = Integer.parseInt(p.readLine());
        
        printRectangle(r,c);
    }
    public void printRectangle(int r,int c){
        int i;
        int j;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}