import java.io.*;

public class Student{
    String name;
    int rollNumber;
    
    public static void main(){
        Student obj = new Student();
        Student obj1 = new Student("Kush Tanisha");
        Student obj2 = new Student(52);
        Student obj3 = new Student("Kush Laiba",52);
        
        obj.print();
    }
    Student(){
        this.name = "";
        this.rollNumber = -1;
    }
    Student(String name){
        this.name = name;
        this.rollNumber = -1;
    }
    Student(int rollNumber){
        this.name = "";
        this.rollNumber = rollNumber;
    }
    Student(String name , int RollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }
}