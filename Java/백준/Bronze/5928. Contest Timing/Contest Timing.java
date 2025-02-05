import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt(),
			hour = sc.nextInt(),
			minute = sc.nextInt();
		
		day -= 11;
		hour -= 11;
		minute -= 11;
		if (day < 0)
			day += 12;
		if (hour < 0)
		{
			day--;
			hour += 24;
		}
		if (minute < 0)
		{
			hour--;
			minute += 60;
		}
		
		if (day < 0 || hour < 0 || minute < 0)
			System.out.println("-1");
		else
			System.out.println(day * 1440 + hour * 60 + minute);
		
	}
}