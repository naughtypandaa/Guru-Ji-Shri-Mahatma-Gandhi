import java.io.*;

public class SeriesMenu{
    public  void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("1 - (Natural Numbers)1,2,3,......,n");
        System.out.println("2 - (Even Numbers)0,2,4,......,n");
        System.out.println("3 - (Odd Numbers)1,3,5,......,n");
        System.out.println("4 - (Ficonacci Series)0,1,2,......,nth term");
        System.out.println("\n\nPlease Enter your choice:: ");
        int n;
        int choice;
        choice = Integer.parseInt(p.readLine());
        System.out.println("Enter the value of n:: ");
        n = Integer.parseInt(p.readLine());
        switch(choice){
            case 1:{
                generateNaturalNumber(n);
                break;
            }
            case 2:{
                generateEvenNumber(n);
                break;
            }
            case 3:{
                generateOddNumber(n);
                break;
            }
            case 4:{
                generateFibonacciSeries(n);
                break;
            }
            default:{
                System.out.println("Invalid");
                break;
            }
        }
    }
    public void generateNaturalNumber(int n){
        int i;
        for(i=1;i<=n;i++){
            System.out.print(i+",");
        }
    }
    public void generateEvenNumber(int n){
        int i;
        for(i=0;i<=n;i=i+2){
            System.out.print(i+",");;
        }
    }
    public void generateOddNumber(int n){
        int i;
        for(i=1;i<=n;i=i+3){
            System.out.print(i+",");
        }
    }
    public void generateFibonacciSeries(int n){
        int a;int b;int c;int i;
        a=0;
        b=1;
        System.out.println(a+","+b+",");
        for(i=3;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}