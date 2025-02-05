import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
			
		int hour = sc.nextInt(),
			minute = sc.nextInt(),
			cook = sc.nextInt();
		
		minute += cook;
		hour += minute / 60;
		minute %= 60;
		if (hour >= 24)
			hour -= 24;
		
		System.out.println(hour + " " + minute);
	}
}