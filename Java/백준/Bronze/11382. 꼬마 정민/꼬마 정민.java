import java.math.BigInteger;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		BigInteger result = sc.nextBigInteger();
		
		System.out.println(result.add(sc.nextBigInteger()).add(sc.nextBigInteger()));
		
	}
}