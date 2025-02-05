import java.math.BigInteger;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger result = sc.nextBigInteger();
		for (int i = 0; i < 4; i++)
		{
			result = result.add(sc.nextBigInteger());
		}
		System.out.println(result);
	}
}