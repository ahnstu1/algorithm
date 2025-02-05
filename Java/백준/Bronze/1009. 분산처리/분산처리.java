import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int testCaseCount = sc.nextInt(),
        	number, powNumber, result;
        
        for(int i = 0; i < testCaseCount; i++){
        	
        	number = sc.nextInt();
        	result = number % 10;
        	powNumber = sc.nextInt();
        	
            for(int j = 1; j < powNumber; j++) {
            	
            	result *= number;
            	result %= 10;
            	
            }
            if(result == 0) result = 10;
            System.out.println(result);
        }
        
    }
    
}