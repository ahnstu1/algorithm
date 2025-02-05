import java.util.Scanner;
import java.math.BigInteger;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		    
        int n = sc.nextInt(),
            k = sc.nextInt();
         
        BigInteger num = new BigInteger("1");
        
        for(int i = n; (n - i) != k; i--){                                                                                             
        	
        	num = num.multiply(new BigInteger(String.valueOf(i)));
        	
        }
        
        for(int i = k; i > 0; i--) {
        	
        	num = num.divide(new BigInteger(String.valueOf(i)));
        	
        }
	    
        System.out.println(num.remainder(new BigInteger("10007")));
 
    }
    
}