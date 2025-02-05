import java.util.Scanner;

class Main{
    
    public static long[] store;
    
    public static long solved(int input)
	{
		if (input == 0)
		{
			return 0;
		}
		else if (input == 1)
		{
			return 1;
		}
		else if (store[input - 1] != 0)
		{
			return store[input - 1];
		}
		else
		{
			store[input - 1] = solved(input - 1) + solved(input - 2);
		}
		return store[input - 1];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		store = new long[input];
		
		System.out.println(solved(input));
		
	}
    
}