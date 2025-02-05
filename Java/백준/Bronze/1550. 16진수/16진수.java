import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String hex = "0123456789ABCDEF",
			   input = sc.next();
		
		int result = 0;
		
		for (int i = 0; i < input.length(); i++)
		{
			result *= 16;
			for (int j = 0; j < 16; j++)
			{
				if (hex.charAt(j) == input.charAt(i))
					result += j;
			}
		}
		
		System.out.println(result);
		
	}
}