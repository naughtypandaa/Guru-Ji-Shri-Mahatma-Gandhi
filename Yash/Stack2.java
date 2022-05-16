import java.io.*;
public class Stack2
{
    int top = -1;
    int stack[] = new int[5];
    
    public static void main(String args[])throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        Stack2 obj = new Stack2();
        
        int ch;
        int a;
        ch = 0;
        while(ch != 3) {
         
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Exit");
            System.out.print("\nChoice - ");
        
            ch = Integer.parseInt(p.readLine());
            
            switch(ch) {
                case 1: {
                    System.out.println("Enter the element you want to push :: ");
                    a = Integer.parseInt(p.readLine());
                    obj.push(a);
                    break;
                }
                case 2: {
                    int ele = obj.pop();
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    System.out.println("\n!!!!!Invalid Choice!!!!!");
                    break;
                }
            }
        } 
    }
    
    public void push(int a) {
        if(top+1<5) {
            top++;
            stack[top] = a;
        }
        else {
            System.out.println("Overflow !! (Stack bhar chuka hai)");
        }
    }
    
    public int pop() {
        int ele;
        if(top == -1) {
            ele = -1;
            System.out.println("Underflow (Khali ho gya hai stack)");
        }
        else {
            ele = stack[top];
            top--;
        }
        return ele;
    }
}