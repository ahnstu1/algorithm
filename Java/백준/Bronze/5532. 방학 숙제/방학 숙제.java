import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt(),
			a = sc.nextInt(),
			b = sc.nextInt(),
			c = sc.nextInt(),
			d = sc.nextInt();
		
		System.out.println(l - (a / c > b / d ? a % c == 0 ? a / c : a / c + 1 : b % d == 0 ? b / d : b / d + 1));
		
	}
}