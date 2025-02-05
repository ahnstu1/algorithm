import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(),b = a, count = 0;
        
        while(true){
            
          a = (a % 10) * 10 + (a / 10 + a % 10) % 10;
            
          count++;
            
          if(b==a) break;  
        }
        System.out.println(count); 
    }
    
}