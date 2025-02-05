import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int testCaseCount = sc.nextInt(),
            leftCombination, rightCombination, divide;
        
        long result, store;
        
        for(int i = 0; i < testCaseCount; i++){
            
            rightCombination = sc.nextInt();
            leftCombination = sc.nextInt();
            
            divide = 1;
            result = 1;
            
            for(int j = leftCombination; j > leftCombination - rightCombination; j--){
            	
                result *= j;
                
                if(rightCombination >= divide) {
                	store = result % divide;
                	result /= divide;
                	result += store;
                	divide++;
                	
                }
                
            }
            
            while(rightCombination >= divide) {
            	store = result % divide;
            	result /= divide;
            	result += store;
            	divide++;
            }
            
            
            System.out.println(result);
            
        }
        
    }
    
}