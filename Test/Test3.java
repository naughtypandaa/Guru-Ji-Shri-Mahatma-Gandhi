import java.io.*;

class Employee{
    String name;
    int iD;
    Employee next;
    String city;
    long phoneNo;
    Employee(String name, int iD, Employee next, String city, long phoneNo){
        this.name = name;
        this.next = next;
        this.iD = iD;
        this.city = city;
        this.phoneNo = phoneNo;
    }
    Employee(){
        this.name = "";
        this.next = null;
        this.iD = 0;
        this.city = "";
        this.phoneNo = 0;
    }
}
public class Test3{
    Employee start;
    public static void main(String args[])throws IOException{
        
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        Test3 list = new Test3();
        
        System.out.println("Enter Number Of Nodes::");
        int n = Integer.parseInt(p.readLine());
        int i;
        String name;
        int iD;
        String city;
        long phoneNo;
        for(i=0;i<n;i++){
            System.out.println("Enter Name::");
            name = p.readLine();
            System.out.println("Enter ID:: ");
            iD = Integer.parseInt(p.readLine());
            System.out.println("Enter City::");
            city = p.readLine();
            System.out.println("Enter a Phone Number:: ");
            phoneNo = Long.parseLong(p.readLine());
            
            list.addNode(iD,name,city,phoneNo);
        }
    }
    public void addNodeAtBeginning(int iD,String name,String city,long phoneNo){
        if(start == null){
            start = new Employee(name,iD,null,city,phoneNo); 
        }
        else{
            Employee temp;
            temp = new Employee(name,iD,start,city,phoneNo);
            start = temp;
        }
    }
    public void addNode(int iD,String name,String city,long phoneNo){
        if(start == null){
            start = new Employee(name,iD,null,city,phoneNo);
        }
        else{
            Employee temp;
            temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Employee(name,iD,null,city,phoneNo);
        }
    }
    public int count(){
        int count ;
        count = 0;
        Employee temp;
        temp = start;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }
    public void display(int iD,String name,String city,long phoneNo){
        Employee temp;
        temp = start;
        while(temp != null){
            System.out.print("Name:: "+temp.name+" Employee Id:: "+temp.iD+" City:: "+temp.city+" Phone Number:: "+temp.phoneNo);
            temp = temp.next;
        }
        System.out.println();
    }
    public int search(String city2){
        Employee temp;
        temp = start;
        int count = 0;
        while(temp != null){
            if(temp.city.equals(city2)){
                return count;
            }
            else{
                count++;
                temp = temp.next;
            }
        }
        return -1;
    }
}