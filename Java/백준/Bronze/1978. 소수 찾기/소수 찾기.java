import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numberCount,
            result,
            number;
        
        numberCount = sc.nextInt();
        result = numberCount;
        
        for(int i = 0; i < numberCount; i++){
            
            number = sc.nextInt();
            
            if(number == 1) result--;
            
            for(int j = 2; j < number; j++){
                
                if(number % j == 0){
                    result--;
                    break;
                }
                
            }
            
        }
        
        System.out.println(result);
         
    }
    
}