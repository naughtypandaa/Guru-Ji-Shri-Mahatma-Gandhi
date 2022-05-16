import java.io.*;
public class TicTacToe{
    
    BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
    
    public void main()throws IOException{
        
        
        char arr[][] = {{'0','1','2'},{'3','4','5'},{'6','7','8'}};
        int i;
        printArray(arr);
        for(i=0;i<9;i++){
            takeChance(arr,i); 
            if (checkWinner(arr,i)){
                break;
            }
        }
        if(i==9){
            System.out.println("Khicdi pakk gyi");
        }
    }
    public void takeChance(char arr[][],int chanceNo)throws IOException{
        char ch;
        int n;
        int r;
        int c;
        //checking for player 1 choice 
        if(chanceNo%2 == 0){
            System.out.println("Chance of Player 1");
            ch = 'X';
        }
        else{
            System.out.println("Chance of Player 2");
            ch = 'O';
        }
        //infinite loop to take input
        while(true) {
            System.out.print("Enter the cell Number:: ");
            n = Integer.parseInt(p.readLine());
            if((n<0) || (n>8)){
                System.out.println("Invalid Input!!!!!!");
                continue;
            }
            r=n/3;
            c=n%3;
            //checking whether the cell is already occupied or not
            if((arr[r][c] == 'X') || (arr[r][c] == 'O')){
                System.out.println("Invalid Input!!!1");
                continue;
            }
            arr[r][c] = ch;
            break;
        }
        printArray(arr);
    }
    public void printArray(char arr[][]){
        int r;
        int c;
        for(r=0;r<3;r++){
            for(c=0;c<3;c++){
                System.out.print(arr[r][c]+"\t");
            }
            System.out.println();
        }
    }
    public boolean checkWinner(char arr[][],int chanceNo){
        char ch;
        int n;
        int r;
        int c;
        //checking for player 1 choice 
        if(chanceNo%2 == 0){
            
            ch = 'X';
            chanceNo = 1;
        }
        else{
            
            ch = 'O';
            chanceNo = 2;
        }
        //Checking for rows       
        if(((arr[0][0] == arr[0][1]) && (arr[0][1] == arr[0][2])) || ((arr[1][0] == arr[1][1]) && (arr[1][1] == arr[1][2])) || ((arr[2][0] == arr[2][1]) && (arr[2][1] == arr[2][2])))       
        {           
            System.out.println("!!! Player "+chanceNo+" has won !!!");           
            return true;        
        }               
        //Checking for columns
        if(((arr[0][0] == arr[1][0]) && (arr[1][0] == arr[2][0])) || ((arr[0][1] == arr[1][1]) && (arr[1][1] == arr[2][1])) || ((arr[0][2] == arr[1][2]) && (arr[1][2] == arr[2][2])))        
        {            
            System.out.println("!!! Player "+chanceNo+" has won !!!");
            return true;        
        }
        //Checking for diagonals
        if(((arr[0][0] == arr[1][1]) && (arr[1][1] == arr[2][2])) || ((arr[0][2] == arr[1][1]) && (arr[1][1] == arr[2][0]))){
            System.out.println("!!! Player "+chanceNo+" has won !!!");
            return true;
        }
        return false;
    }
}