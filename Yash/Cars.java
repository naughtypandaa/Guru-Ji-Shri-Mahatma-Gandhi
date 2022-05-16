import java.io.*;

public class Cars{
    String company;
    String model;
    int cost;
    boolean isPetrol;
    public static void main(String args[])throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        
        System.out.println("Enter Company of First Car:: ");
        car1.company = p.readLine();
        System.out.println("Enter Model of First Car:: ");
        car1.model = p.readLine();
        System.out.println("Enter Cost of First Car:: ");
        car1.cost = Integer.parseInt(p.readLine());
        System.out.println("First Car Is Petrol:: ");
        car1.isPetrol = Boolean.parseBoolean(p.readLine());
        
        System.out.println("Enter Company of Second Car:: ");
        car2.company = p.readLine();
        System.out.println("Enter Model of Second Car:: ");
        car2.model = p.readLine();
        System.out.println("Enter Cost of Second Car:: ");
        car2.cost = Integer.parseInt(p.readLine());
        System.out.println("Second Car Is Petrol:: ");
        car2.isPetrol = Boolean.parseBoolean(p.readLine());
        
        car1.display();
    }
    public void display(){
        System.out.println("Name of the Company is:: "+this.company+" and the Model is "+this.model+" which costs "+this.cost+" and is Petrol "+this.isPetrol);
    }
}