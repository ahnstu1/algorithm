import java.util.Scanner;
import java.math.BigInteger;

class Main
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger input1 = sc.nextBigInteger(),
				   input2 = sc.nextBigInteger();
		
		System.out.println(input1.add(input2));
		System.out.println(input1.subtract(input2));
		System.out.println(input1.multiply(input2));
		
	}
}