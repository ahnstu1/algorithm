import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for(int b = 1; b < 10; b++){
            
            System.out.printf("%d * %d = %d\n", a, b, a*b);
            
        }
        
        
    }
    
}