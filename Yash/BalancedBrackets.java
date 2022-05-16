import java.io.*;
public class BalancedBrackets
{
    int top;
    char stack[];
    
    BalancedBrackets() {
        this.top = -1;
        this.stack = new char[0];
    }
    
    BalancedBrackets(int len) {
        this.top = -1;
        this.stack = new char[len];
    }
    
    public static void main(String args[])throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a String of brackets");
        String str = br.readLine();
        int len = str.length();
        
        BalancedBrackets bb = new BalancedBrackets(len);
        int i;
        char ch;
        boolean flag;
        flag = true;
        for(i = 0;i<len;i++) {
            ch = str.charAt(i);
            if((ch == '(') || (ch == '[') || (ch == '{')) {
                flag = bb.push(ch);
                if(!flag) {
                    break;
                }
            }
            else if((ch == ')') || (ch == ']') || (ch == '}')) {
                flag = bb.pop(ch);
                if(!flag) {
                    break;
                }
            }
        }
        if(!flag || bb.top != -1) {
            System.out.println("Brackets are imbalanced");
        }
        else {
            System.out.println("Brackets are balanced");    
        }
    }
    public boolean push(char ch) {
        if(top == stack.length-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            top++;
            stack[top] = ch;
        }
        return true;
    }
    public boolean pop(char ch) {
        char topele;
        if(top == -1) {
            System.out.println("Stack Underflow");
            return false;
        }
        else {
            topele = stack[top];
            if(((ch == ')') && (topele != '(')) ||((ch == ']') && (topele != '[')) || ((ch == '}') && (topele != '{'))) {
                return false;
            }
            else {
                top--;
            }
        }
        return true;
    }
}