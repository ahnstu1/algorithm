import java.util.Scanner;
import java.math.BigInteger;

class Main
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger total = sc.nextBigInteger(),
				   diff  = sc.nextBigInteger();
		
		System.out.println(total.add(diff).divide(new BigInteger("2")));
		System.out.println(total.subtract(diff).divide(new BigInteger("2")));
		
	}
}