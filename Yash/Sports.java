import java.io.*;

public class Sports{
    int players;
    int teams ;
    String game;
    public static void main()throws IOException{
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        Sports obj = new Sports();
        System.out.println("Enter Name of Game:: ");
        obj.game = p.readLine();
        
        System.out.println("Enter Number of player in a team:: ");
        obj.players = Integer.parseInt(p.readLine());
    }
}