import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		long result = 0;
		
		for (int i = 0; i < input.length(); i++)
		{
			result = (result * 10 + (input.charAt(i) - '0')) % 20000303;
		}
		
		System.out.println(result);
		
	}
}