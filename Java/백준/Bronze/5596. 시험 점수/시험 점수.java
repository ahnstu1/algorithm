import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int min = 0,
			man = 0;
		
		min += sc.nextInt();
		min += sc.nextInt();
		min += sc.nextInt();
		min += sc.nextInt();
		man += sc.nextInt();
		man += sc.nextInt();
		man += sc.nextInt();
		man += sc.nextInt();
		
		if (man > min)
			System.out.println(man);
		else
			System.out.println(min);
	}
}