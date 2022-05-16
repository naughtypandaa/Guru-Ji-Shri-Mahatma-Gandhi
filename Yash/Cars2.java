import java.io.*;

public class Cars2{
    String company;
    String model;
    int cost;
    boolean isPetrol;
    public static void main(String args[])throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Cars");
        int n = Integer.parseInt(p.readLine());
        
        Cars2 carList[] = new Cars2[n];
        int i;
        
        for(i=0;i<n;i++){
        carList[i] = new Cars2();
        System.out.println("Enter Company of Car:: ");
        carList[i].company = p.readLine();
        
        System.out.println("Enter Model of  Car:: ");
        carList[i].model = p.readLine();
        
        System.out.println("Enter Cost of  Car:: ");
        carList[i].cost = Integer.parseInt(p.readLine());
        
        System.out.println(" Car Is Petrol:: ");
        carList[i].isPetrol = Boolean.parseBoolean(p.readLine());   
        
        }
        for(i=0;i<n;i++){
            carList[i].display();
        }
    }
    public void display(){
        System.out.println("Name of the Company is:: "+this.company+" and the Model is "+this.model+" which costs "+this.cost+" and is Petrol "+this.isPetrol);
    }
}