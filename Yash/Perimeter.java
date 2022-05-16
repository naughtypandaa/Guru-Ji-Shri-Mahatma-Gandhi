public class Perimeter{
    public void main(){
        int length;//For Rectangle
        int breath;//For Rectangle
        int side;//For Square
        double radius;//For Circle
        int s1;//For Triangle
        int s2;//For Triangle
        int s3;//For Triangle
        length = 2;
        breath = 3;
        side = 4;
        radius = 45;
        s1 = 35;
        s2 = 45;
        s3 = 458;
        calculatePerimeter(length,breath);
        calculatePerimeter(side);
        calculatePerimeter(radius);
        calculatePerimeter(s1,s2,s3);
    }
    public void calculatePerimeter(int length,int breath){
        int perimeter;
        perimeter = 2*(length + breath);
        System.out.println("Perimeter of Rectange is:: "+perimeter);
    }
    public void calculatePerimeter(int side){
        int perimeter;
        perimeter = 4*(side);
        System.out.println("Perimeter of Square is:: "+perimeter);
    }
    public void calculatePerimeter(double radius){
        double perimeter;
        perimeter = 2*3.14*radius;
        System.out.println("Perimeter of Circle is:: "+perimeter);
    }
    public void calculatePerimeter(int s1,int s2,int s3){
        int perimeter;
        perimeter = s1+s2+s3;
        System.out.println("Perimeter of Triangle is:: "+perimeter);
    }
}