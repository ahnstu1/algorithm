import java.util.Scanner;

class Main
{
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int burger = 2000,
			drink = 2000,
			pardon;
		
		for (int i = 0; i < 5; i++)
		{
			pardon = sc.nextInt();
			if (i < 3)
			{
				if (burger > pardon)
					burger = pardon;
			}
			else
			{
				if (drink > pardon)
					drink = pardon;
			}
		}
		
		System.out.println(burger + drink - 50);

	}
    
}