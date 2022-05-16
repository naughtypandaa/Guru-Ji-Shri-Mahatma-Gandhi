import java.io.*;
public class Book{
    String author;
    String title;
    String isbnNo;
    
    Book(){
    System.out.println("Constructor Invoked");
    }
    Book(String title){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        
        //BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        Book book1 = new Book();
        book1.author = "Chetan Bhangat";
        book1.title = "3 Mistakes Of My Life";
        book1.isbnNo = "9875867AY ";
        
        Book book2 = new Book();
        book2.author = "Gernimo Stilton";
        book2.title = "Stinky Chesse Vacation";
        book2.isbnNo = "9875867ADEGA ";
        System.out.println("Author "+book1.author+" has Written "+book1.title+" having isbn number "+book1.isbnNo+".");
        System.out.println("Author "+book2.author+" has Written "+book2.title+" having isbn number "+book2.isbnNo+".");
    }
}