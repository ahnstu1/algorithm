import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int repeatCount = sc.nextInt(),
            testCaseRepeatCount;
        
        String str,
               result;
        
        for(int i = 0; i < repeatCount; i++){
            
            result = "";
            
            testCaseRepeatCount = sc.nextInt();
            
            str = sc.next();
            
            for(int j = 0; j < str.length(); j++){
                
                for(int k = 0; k < testCaseRepeatCount; k++){
                    
                    result += str.charAt(j);
                    
                }
                
            }
            
            System.out.println(result);
            
        }
        
    }
    
}