import java.util.Scanner;
import java.math.BigInteger;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        BigInteger a, b;
        
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
        
    }
    
}