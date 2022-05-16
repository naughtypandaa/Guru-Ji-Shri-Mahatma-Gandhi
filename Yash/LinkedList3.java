import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(){
        this.data = 0;
        this.next = null;
    }
}

public class LinkedList3{
    Node start;
    public static void main(String args[])throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Nodes::");
        
        LinkedList3 list = new LinkedList3();
        
        int n = Integer.parseInt(p.readLine());
        int i;
        int data;
        for(i=0;i<n;i++){
            System.out.println("Enter a Number");
            data = Integer.parseInt(p.readLine());
            list.addNode(data);
        }
        
    }
    public void addNode(int data){
        if(start == null){
            start = new Node(data,null);
        }
        else{
            Node temp;
            temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data,null);
        }
    }
    public void addAtBeginning(int data){
        if(start == null){
            start = new Node(data,null);
        }
        else{
            Node temp = new Node(data,start);
            temp.next = start;
        }
    }
    public void display(){
       Node  temp;
       temp = start;
       while(temp != null){
           System.out.println(temp.next+"-->>");
           temp = temp.next;
       }
       System.out.println();
    }
    public int search(int term){
        Node temp;
        temp = start;
        int count;
        count = 0;
        while(temp != null){
            if(temp.data == term){
                return count;
            }
            else{
                count++;
                temp = temp.next;
            }
        }
        return -1;
    }
    public int count(){
        Node temp;
        temp = start;
        int c =0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public void deleteNode(int term){
        if(start == null){
            System.out.println("The Node is Already empty");
        }
        else if(start.data == term){
            start = start.next;
            System.out.println("Term Successfully Deleted");
            return;
        }
 
        else{
            Node temp;
            temp = start;
            while(temp.next != null){
                if(temp.next.data == term){
                    temp. next = temp.next.next;
                    System.out.println("Term Successfully Deleted");
                    return;
                }
                else{
                    temp = temp.next;
                }
            }
        }
        System.out.println("Number not Found");
    }
}
