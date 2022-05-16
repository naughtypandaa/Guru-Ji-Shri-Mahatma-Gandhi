import java.io.*;
import java.io.BufferedReader;

public class Student2{
    String name;
    String clas;
    int rollNO;
    char section;
    int NumberOfSubjects;
    int marks[];
    String subjects[];
    
    public static void main(String args[])throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        Student stu1 = new Student();
        System.out.println("stu1="+stu1);
        
        System.out.println("Enter Name(Kripya karke naam likhiye)::");
        String name = p.readLine();
        
        System.out.println("Enter Class::");
        String clas = p.readLine();
        
        System.out.println("Enter roll Number::");
        int rollNO = Integer.parseInt(p.readLine());
        
        System.out.println("Enter Number of Subjects::");
        int NumberOfSubjects = Integer.parseInt(p.readLine());
        
        System.out.println("Enter Section::");
        char section = (char)p.read();
        
        int marks[] = new int[NumberOfSubjects];
        String subjects[] = new String[NumberOfSubjects];
        
        int i;
        for(i=0;i<NumberOfSubjects;i++){
            subjects[i] = p.readLine();
            marks[i] = Integer.parseInt(p.readLine());
        }
        Student2 stu2 = new Student2(name,clas,rollNO,section,NumberOfSubjects,marks,subjects);
    }
    @Override
    public String toString(){
       String result = "Name = "+this.name+"\nStandard = "+this.clas+"\nrollNo = "+this.rollNO+"\nSection = "+this.section+"\nNumber of Subjects = "+this.NumberOfSubjects+"\nMarks::"; 
       for(int i=0;i<NumberOfSubjects;i++){
           result = result+"\n"+this.subjects[i]+" :: "+marks[i];
       }
       return result;
    }
    Student2(){
        this.name = "";
        this.clas = "";
        this.rollNO = 0;
        this.section = ' ';
        this.NumberOfSubjects = 0;
        this.marks = new int[this.NumberOfSubjects];
        this.subjects = new String[this.NumberOfSubjects];
    }
    Student2(String name,String clas,int rollNO,char section,int NumberOfSubjects,int marks[],String subjects[]){
        this.name = name;
        this.clas = clas;
        this.rollNO = rollNO;
        this.section = section;
        this.NumberOfSubjects = NumberOfSubjects;
        this.marks = marks;
        this.subjects = subjects;
    }
    public String getName(){
      return this.name;  
    }
    public void setName(String name){
      this.name = name;  
    }
    public String getClas(){
      return this.clas;  
    }
    public void setClas(String clas){
      this.name = name;  
    }
    public int getRollNo(){
      return this.rollNO;  
    }
    public void setRollNo(int rollNo){
      this.rollNO = rollNO;  
    }
    public char getSection(){
      return this.section;  
    }
    public void setRollNo(char section){
      this.section = section;
      
    }
    public int getNoOfSubjects(){
      return this.NumberOfSubjects;  
    }
    public void setNoOfSubjects(int NumberOfSubjects){
      this.NumberOfSubjects = NumberOfSubjects;  
    }
    public String[] getSubjects(){
      return this.subjects;  
    }
    public void setSubjects(String[] subjects){
      this.subjects = subjects;  
    }public int[] getMarks(){
      return this.marks;  
    }
    public void setMarks(int[] marks){
      this.marks = marks;
    }
}