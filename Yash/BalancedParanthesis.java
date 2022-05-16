import java.io.*;

public class BalancedParanthesis{
    public static void main(String args[])throws IOException{
        
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String to be checked :: ");
        String str = p.readLine();
        
        int lambai = str.length();
        int ginti = 0;
        
        int i;
        for(i=0;i<lambai;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                ginti ++;
            }
            else if(ch == ')'){
                ginti --;
            }
        }
        if(ginti == 0){
            System.out.println("Saare Darwaze Band hai");
        }
        else{
            System.out.println("Aapke dwaar khule hai kripya karke unnhe band karlijye");
            System.out.println("Durghatna se der bhali");
        }
    }
}