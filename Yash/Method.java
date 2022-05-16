public class Method{
    public void main(){
        System.out.println("In Main");
        int a;
        a=5;
        method1(a);
        System.out.println(a);
    }
    public void method1(int a){
        System.out.println("In Method1");
        a=10;
        System.out.println(a);
    }
}