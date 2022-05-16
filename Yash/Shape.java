//A Single Sheet of Paper Cannot decide my feature.

public class Shape{
    String name;
    int sides;
    String colour;
    public static void main(String args[]){
        
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("Square",4,"Olive");
        Shape shape3 = new Shape();
        Shape shape4 = new Shape("Hexagon",6,"Blue");
        
        shape1.display();
        shape2.display();
        shape3.display();
        shape4.display();
    }
    Shape(){
        this.name = "None";
        this.sides = 0;
        this.colour = "White";
    }
    Shape(String name ,int sides, String colour ){
        this.name = name;
        this.sides = sides;
        this.colour = colour;
    }
    public void display(){
        System.out.println("Name of Shape is "+this.name+" it has "+this.sides+" Sides and is in "+this.colour );
    }
}