import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int hour, minute, second;
		
		for (int i = 0; i < 3; i++)
		{
			hour = sc.nextInt();
			minute = sc.nextInt();
			second = sc.nextInt();
			hour = sc.nextInt() - hour;
			minute = sc.nextInt() - minute;
			second = sc.nextInt() - second;
			if (second < 0)
			{
				minute--;
				second += 60;
			}
			if (minute < 0)
			{
				hour--;
				minute += 60;
			}
			System.out.printf("%d %d %d\n", hour, minute, second);
		}
		
	}
}