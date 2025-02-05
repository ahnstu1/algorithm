import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
    
        int a, b, c, memorize;
    
        while(true){
            
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            
            if(a > b) {
        	    memorize = b;
        	    b = a;
            	a = memorize;
            }
        
            if(b > c) {
               	memorize = c;
            	c = b;
            	b = memorize;
            }
            
            if(a == 0) break;
        
            if(c*c == (a*a + b*b)) {
        	
            	System.out.println("right");
        	
            }else {
        	
            	System.out.println("wrong");
            	
            }
        
        }

        
    }
    
}