import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int result = 1;
        
        for(int i = sc.nextInt(); i > 0 ; i--){
            
            result *= i;
            
        }
        
        System.out.println(result);
        
    }
    
}