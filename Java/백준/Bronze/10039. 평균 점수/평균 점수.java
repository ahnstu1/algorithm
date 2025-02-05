import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
		
		int result = 0,
			score;
		
		for(int i = 0; i < 5; i++)
		{
			score = sc.nextInt();
			if (score < 40)
				result += 40;
			else
				result += score;
		}
		
		System.out.println(result / 5); 
    }
}