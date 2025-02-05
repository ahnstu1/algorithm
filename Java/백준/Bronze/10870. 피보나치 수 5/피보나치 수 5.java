import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int result = 0, a = 0, b = 1;
        
        for(int i = sc.nextInt(); i > 0 ; i--){
            
            result = a + b;
            
            b = a;
            a = result;
            
            
        }
        
        System.out.println(result);
        
    }
    
}