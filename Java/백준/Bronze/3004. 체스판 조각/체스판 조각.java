import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt(),
			a = 1,
			b = 1;
		
		for (int i = 0; i < input; i++)
		{
			if (i % 2 == 0)
				a++;
			else
				b++;
		}
		
		System.out.println(a * b);
		
	}
}