import java.io.*;
import java.util.*;

public class Area2{
    public void main(){
        int length;//For rectange
        int breath;//For rectange
        int side;//for Square
        double radius;//For Circle
        side = 10;
        length=50;
        breath=20;
        radius = 5;
        calculateArea(side);
        calculateArea(length,breath);
        calculateArea(radius);
    }
    public void calculateArea(int side){
        int areaOfsquare;
        areaOfsquare = side*side;
        System.out.println("Area of Square is:: "+areaOfsquare);
    }
    public void calculateArea(int length,int breath){
        int areaOfRectange;
        areaOfRectange = length*breath;
        System.out.println("Area of Rectange is:: "+areaOfRectange);
    }
    public void calculateArea(double radius){
        double areaOfCircle;
        areaOfCircle = 3.14*radius*radius;
        System.out.println("Area of Circle is:: "+areaOfCircle);
    }
}