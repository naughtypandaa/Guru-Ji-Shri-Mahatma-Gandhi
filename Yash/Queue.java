import java.io.*;

public class Queue {
    
    int f;
    int r;
    int queue[];
    int capacity;
    Queue() {
        this.f = -1;
        this.r = -1;
        this.queue = null;
    }
    Queue(int capacity) {
        this.f = -1;
        this.r = -1;
        this.capacity = capacity;
        queue = new int[this.capacity];
    }
    public static void main(String args[])throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("What will be the capacity of the Queue ?");
        int n = Integer.parseInt(p.readLine());
        Queue q = new Queue(n);
        
        int ch;
        int x;
        ch = -1;
        while(ch != 4) {
            System.out.println("1 - Insertion");
            System.out.println("2 - Deletion");
            System.out.println("3 - Display");
            System.out.println("4 - Exit");
            System.out.println("Enter your choice :: ");
            
            ch = Integer.parseInt(p.readLine());
            switch(ch) {
                case 1: {
                    System.out.println("Enter the value you want to insert :: ");
                    x = Integer.parseInt(p.readLine());
                    q.insert(x);
                    break;
                }
                case 2: {
                    q.delete();
                    break;
                }
                case 3: {
                    q.display();
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }
    }
    public void insert(int x) {
        //Overflow condition. Queue is completely full
        if(r == this.capacity-1){
            System.out.println("Overflow");
        }
        else if((this.f==-1) && (this.r==-1)) {
            this.f = 0;
            this.r = 0;
            this.queue[this.f] = x;
        }
        else if(this.f > this.r) {
            this.r = this.f;
            this.queue[this.f] = x;
        }
        else {
            this.r++;
            this.queue[this.r] = x;
        }
    }
    
    public void display() {
        if((this.f>this.r) || ((this.f==-1) && (this.r==-1))) {
            System.out.println("The queue is empty");
        }
        else {
            int i;
            for(i=this.f;i<=this.r;i++) {
                System.out.print(this.queue[i]+" ==>");
            }
        }
        System.out.println();
    }
    
    public void delete() {
        if((this.f>this.r) || ((this.f==-1) && (this.r==-1))) {
            System.out.println("The queue is empty");
        }
        else {
            int ele = queue[this.f];
            System.out.println(ele+ " element is deleted");
            f++;
        }
    }
}