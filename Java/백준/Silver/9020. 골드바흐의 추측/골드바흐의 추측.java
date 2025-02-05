import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int testCaseCount,
            insertNumber;
        
        boolean check;
        
        testCaseCount = sc.nextInt();
        
        for(int i = 0; i < testCaseCount; i++){
            
            insertNumber = sc.nextInt();
            
            for(int j = (insertNumber / 2); j > 0; j--){
                
                check = true;
                
                for(int k = 2; k < j; k++){
                    
                    if(k > 997) break;
                    
                    if(j % k == 0){
                        
                        check = false;
                        break;
                        
                    }
                    
                }
                
                if(check){
                    
                    for(int k = 2; k < (insertNumber - j); k++){
                        
                        if((insertNumber - j) % k == 0){
                            
                            check = false;
                            break;
                            
                        }
                        
                    }
                    
                }
                
                if(check) {
                	
                	if(j > insertNumber - j) {
                		System.out.println(insertNumber - j + " " + j);
                	}else {
                		System.out.println(j + " " + (insertNumber - j));
                	}
                	break;
                	
                }
                
            }
            
        }
        
    }
    
}