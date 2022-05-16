public class CallByRef
{
    int a;
    int b;
    public void main() {
        
        CallByRef obj = new CallByRef();
        obj.a = 5;
        obj.b = 6;
        System.out.println("Before function call");
        System.out.println("a = "+obj.a);
        System.out.println("b = "+obj.b);
        
        int c = add(obj);
        System.out.println("c = "+c);
        System.out.println("After function call");
        System.out.println("a = "+obj.a);
        System.out.println("b = "+obj.b);
        
    }
    public int add(CallByRef xyz) {
        System.out.println("In function before modification");
        System.out.println("x = "+xyz.a);
        System.out.println("y = "+xyz.b);
        
        xyz.a = 47;
        xyz.b = 56;
        System.out.println("In function after modification");
        System.out.println("x = "+xyz.a);
        System.out.println("y = "+xyz.b);
        
        return xyz.a+xyz.b;
    }
}
