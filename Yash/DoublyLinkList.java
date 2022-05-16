 import java.io.*;

class Node {
    int data;
    Node next;
    Node prev;
    Node(int data,Node next,Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkList
{
    Node start;
    
    public static void main(String args[])throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int n;
        DoublyLinkList list = new DoublyLinkList();
        System.out.println("Enter the number of nodes :: ");
        n = Integer.parseInt(p.readLine());
        int i,data;
        for(i=0;i<n;i++) {
            System.out.println("Enter a number :: ");
            data = Integer.parseInt(p.readLine());
            list.addNode(data);
        }
        
        
    }
    
    public void addNode(int data) {
        if(start == null) {
            start = new Node(data,null,null);
        }
        else {
            Node temp;
            temp = start;
            while(temp.next != null) {
                temp = temp.next;
            }
            Node n1 = new Node(data,null,temp);
            temp.next = n1;
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
            start = new Node(data,null,null);
        }
        else {
            Node temp = new Node(data,start,null);
            start.prev = temp;
            start = temp;
        }
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
                        temp.next.next.prev = temp;
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