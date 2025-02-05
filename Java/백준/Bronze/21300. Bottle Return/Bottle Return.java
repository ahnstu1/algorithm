import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int result = 0;
		
		for (int i = 0; i < 6; i++)
			result += sc.nextInt() * 5;
		
		System.out.print(result);
		
	}
}