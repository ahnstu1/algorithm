import java.math.BigInteger;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		BigInteger result = new BigInteger("0");
		
		for (int i = 0; i < input.length(); i++)
		{
			result = result.multiply(new BigInteger("2"));
			result = result.add(new BigInteger(String.valueOf(input.charAt(i) - '0')));
		}
		result = result.multiply(new BigInteger("17"));
		input = "";
		while (result != BigInteger.valueOf(0))
		{
			input += result.mod(new BigInteger("2"));
			result = result.divide(new BigInteger("2"));
		}
		
		for (int i = input.length() - 1; i >= 0; i--)
		{
			System.out.print(input.charAt(i));
		}
	}
}