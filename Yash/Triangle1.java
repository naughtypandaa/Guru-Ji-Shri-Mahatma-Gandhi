import java.io.*;

public class Triangle1{
    public void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter number of stars:: ");
        int n = Integer.parseInt(p.readLine());
        triangle(n);
        triangle2(n);
        triangle3(n);
        triangle4(n);
    }
    public void triangle(int n){
        //*
        //**
        //***
        //****
        //*****
        int i;
        int j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void triangle2(int n){
        //1
        //2 2
        //3 3 3
        //4 4 4 4 
        //5 5 5 5 5
        
        int i;
        int j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void triangle3(int n){
        //1
        //1 2
        //1 2 3
        //1 2 3 4 
        //1 2 3 4 5 
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void triangle4(int n){
        int j;
        int i;int k;
        k=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}