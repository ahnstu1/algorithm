import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int m, n,
        	min = 0,
        	sum = 0;
        
        boolean check;
        
        m = sc.nextInt();
        n = sc.nextInt();
        
        for(int i = m; i <= n; i++){
        	
            check = true;
            
            for(int j = 2; j < i; j++){
                
                if(i % j == 0){
                    check = false;
                    break;
                }
                
            }
            
            if(check) {
            	
            	if(min == 0) min = i;
            	sum += i;
            	
            }
            
        }
        
        if(min == 0 || (m == 0 && n ==1) || (m == 1 && n ==1)) {
        	System.out.println(-1);
        }else {
        	 if(m == 1 || m == 0) {
        		 sum--;
        		 min = 2;
             }
        	System.out.println(sum);
        	System.out.println(min);
        }
        
    }
    
}