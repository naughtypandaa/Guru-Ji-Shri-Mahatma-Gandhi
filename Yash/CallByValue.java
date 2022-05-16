public class CallByValue
{
    public void main() {
        int a;
        int b;
        a = 5;
        b = 6;
        System.out.println("Before function call");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        int c = add(a,b);
        System.out.println("c = "+c);
        System.out.println("After function call");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
    }
    public int add(int x,int y) {
        System.out.println("In function before modification");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
        x = 47;
        y = 56;
        System.out.println("In function after modification");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
        return x+y;
    }
}