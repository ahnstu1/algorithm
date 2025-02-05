import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
			
		int hour = sc.nextInt(),
			minute = sc.nextInt(),
			second = sc.nextInt();
		
		second += sc.nextInt();
		if (second >= 60)
		{
			minute += second / 60;
			second = second % 60;
		}
		if (minute >= 60)
		{
			hour += minute / 60;
			minute = minute % 60;
		}
		if (hour >= 24)
			hour %= 24;
		
		System.out.printf("%d %d %d", hour, minute, second);
		
	}
}