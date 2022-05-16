//A Single Sheet of Paper Cannot decide my feature.

public class Bike{
    String name;
    int sides;
    String colour;
    public static void main(String args[]){
        
        Bike bike1 = new Bike();
        Shape shape2 = new Shape("Square",4,"Olive");
        Shape shape3 = new Shape();
        Shape shape4 = new Shape("Hexagon",6,"Blue");
        
        
        shape2.display();
        shape3.display();
        shape4.display();
    }
    Bike(){
        this.name = "None";
        this.sides = 0;
        this.colour = "White";
    }
    Bike(String name ,int sides, String colour ){
        this.name = name;
        this.sides = sides;
        this.colour = colour;
    }
    public void display(){
        System.out.println("Name of Shape is "+this.name+" it has "+this.sides+" Sides and is in "+this.colour );
    }
}