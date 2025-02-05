import java.util.Scanner;

class Main{
    
    public static int result = 0;

	public static boolean pardon(int[] field, int x)
	{
		for (int i = 0; i < x; i++)
		{
			if (field[x] == field[i])
			{
				return false;
			}
			
			else if (Math.abs(x - i) == Math.abs(field[x] - field[i]))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void chessMaker(int[] field, int input, int x)
	{
		if (input == x)
		{
			result++;
			return;
		}
		
		for(int i = 0; i < input; i++)
		{
			field[x] = i;
			if (pardon(field, x))
			{
				chessMaker(field, input, x + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int[] field = new int[input];

		chessMaker(field, input, 0);
        
		System.out.println(result);
	}
    
}