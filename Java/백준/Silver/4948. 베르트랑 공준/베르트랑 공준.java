import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int insertNumber = -1,
            result;
        
        while(true){
            
            insertNumber = sc.nextInt();
            if(insertNumber == 0) break;
            result = insertNumber;
            
            for(int i = insertNumber + 1; i <= insertNumber*2; i++){
                
                for(int j = 2; j < i; j++){
                    
                    if(j > 997) break;
                    
                    if(i % j == 0){
                        
                        result--;
                        break;
                        
                    }
                    
                }
                
            }
            System.out.println(result);
        }
        
    }
    
}