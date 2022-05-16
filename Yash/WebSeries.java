import java.io.*;

public class WebSeries{
    public static void main(String args[])throws IOException{
        
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Enter Number Of Terms:: ");
        int n = Integer.parseInt(p.readLine());
        
        int i;
        int sum=0;
        for(i=0;i<n;i++){
            
                sum = sum+(i*(i+1)*(i+2));
        
        }
        System.out.println("Aankhen hansti hai magar dil yeh rota hai, Maante hai jise hum manzil apni, Humsafar uska koi aur hota hai::"+sum);
    }
}