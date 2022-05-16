import java.io.*;

class Diagram{
    public void main(){
        
        diagram1();
    }
    public void diagram1(){
         

        
         int r;
         int c;
         for(r=1;r<=3;r++){
             System.out.print("     ");
             for(c=2;c>=r;c--){
                 System.out.print(" ");
                }
             for(c=1;c<=r;c++){
                 System.out.print("+ ");
             }
             System.out.println();
         }
         for(r=1;r<=5;r++){
             System.out.print(" ");
             for(c=1;c<=r;c++){
                 System.out.print(" ");
             }
             for(c=6;c>=r;c--){
                 System.out.print("* ");
             }
             System.out.println();
         }
         for(r=1;r<=4;r++){
             System.out.print("  ");
             for(c=3;c>=r;c--){
                 System.out.print(" ");
             }
             for(c=1;c<=r+2;c++){
                 System.out.print("- ");
             }
             System.out.println();
         }
         for(r=1;r<=3;r++){
             System.out.print("    ");
             for(c=1;c<=r;c++)
             {
                 System.out.print(" ");
             }
             for(c=3;c>=r;c--){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}