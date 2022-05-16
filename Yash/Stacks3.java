import java.io.*;

public class Stacks3{
    public static void main(String args[])throws IOException{
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter Number Of Stack Elements:: ");
        
        
        //int n = Integer.parseInt(p.readLine());
        
        int top = -1;
        
        int stack[] = new int[5];
        int ch = 0;
        
        while(ch != 3){
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Exit");
            System.out.println("\nChoice");
            
            ch = Integer.parseInt(p.readLine());
            
            switch(ch){
                case 1:{
                    System.out.println("Enter the Number to be Pushed::");
                    int a = Integer.parseInt(p.readLine()); 
                    top = push(stack,top,a);
                    break;
                }
                case 2:{
                    
                    top = pop(stack,top);
                    break;
                }
                case 3:{
                    break;
                }
                default:{
                    System.out.println("\n!!!!!!!!!!Nikal Pakode Nikal Pehli Fursat Mai!!!!!!!!");
                    break;
                }
            }
        }
    }
    public static int push(int stack[],int top,int a){
        if(top+1<5){
            top++;
            stack[top] = a;
        }
        else{
            System.out.println("Overflow");
        }
        return top;
    }
    public static int pop(int stack[],int top){
        if(top == -1){
            System.out.println("Underflow");
        }
        else{
            System.out.println(stack[top]);
            top--;
        }
        return top;
    }
}