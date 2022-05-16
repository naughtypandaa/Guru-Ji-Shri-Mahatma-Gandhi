public class FibonnaciSeries{
    public static void main(String args[]){
        
        int i;
        int n3;
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        
        int count = 12;
        
        for(i=3;i<count;i++){
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}