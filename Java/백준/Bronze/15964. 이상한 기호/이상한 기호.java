import java.math.BigInteger;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger(),
				   b = sc.nextBigInteger();
		
		System.out.println(a.add(b).multiply(a.subtract(b)));
	}
}