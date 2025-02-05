import java.util.Scanner;

class Main
{
   public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
			
		int f = sc.nextInt(),
			s = sc.nextInt(),
			t = sc.nextInt(),
			store;
		
		if (f > s)
		{
			store = f;
			f = s;
			s = store;
		}
		if (s > t)
		{
			store = s;
			s = t;
			t = store;
		}
		if (f > s)
		{
			store = f;
			f = s;
			s = store;
		}
		if (s > t)
		{
			store = s;
			s = t;
			t = store;
		}
		System.out.printf("%d %d %d", f, s, t);
	} 
}