 import java.io.*;

class Node {
    int data;
    Node next;
    
    Node(int data,Node next) {
        this.data = data;
        this.next = next;
    }
    Node() {
        this.data = 0;
        this.next = null;
    }
}

public class LinkedList
{
    Node start;
    
    public static void main(String args[])throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int n;
        LinkedList list = new LinkedList();
        System.out.println("Enter the number of nodes :: ");
        n = Integer.parseInt(p.readLine());
        int i,data;
        for(i=0;i<n;i++) {
            System.out.println("Enter a number :: ");
            data = Integer.parseInt(p.readLine());
            list.addNode(data);
        }
        list.displayList();
        list.addAtBeginning(25);
        list.addAtBeginning(345);
        list.addAtBeginning(115);
        list.addAtBeginning(555);
        list.displayList();
        list.deleteNode(555);
        list.displayList();
        
        list.deleteNode(345);
        list.displayList();
        
        list.deleteNode(2);
        list.displayList();
        
        list.deleteNode(36);
        list.displayList();
        
    }
    
    public void addNode(int data) {
        if(start == null) {
            start = new Node(data,null);
        }
        else {
            Node temp;
            temp = start;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data,null);
        }
    }
    
    public void displayList() {
        Node temp;
        temp = start;
        while(temp != null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void addAtBeginning(int data) {
        if(start == null) {
            start = new Node(data,null);
        }
        else {
            Node temp = new Node(data,start);
            start = temp;
        }
    }
    public int search(int term) {
        Node temp;
        temp = start;
        int count;
        count = 0;
        while(temp != null ) {
            if(temp.data == term) {
                return count;
            }
            else {
                count++;
                temp = temp.next;
            }
        }
        return -1;
    }
    public void deleteNode(int term) {
        //our list is empty
        if(start == null) {
            System.out.println("List is already empty");
        }
        //we have only one node in the list.
        else if(start.next == null) {
            //term matches the data at start.
            if(start.data == term) {
                start = null;
                System.out.println("Term is deleted successfully.");
                return;
            }
        }
        else {
            //checking if the starting node contains the term
            if(start.data == term) {
                start = start.next;
                System.out.println("Term is deleted successfully.");
                return;
            }
            else {
                Node temp;
                temp = start;
                while(temp.next != null) {
                    if(temp.next.data == term) {
                        temp.next = temp.next.next;
                        System.out.println("Term is deleted successfully.");
                        return;
                    }
                    else {
                        temp = temp.next;
                    }
                }
            }
        }
        System.out.println("Term not found.");
    }
}