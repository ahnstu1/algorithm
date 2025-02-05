import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt(),
            k = sc.nextInt(),
            result = 1;
    
        for(int i = n; (n - i) != k; i--){
        
            result *= i;
        
        }
    
        for(int i = 1; i <= k; i++){
        
            result /= i;
            
        }
    
        System.out.println(result);
        
    }
    
}