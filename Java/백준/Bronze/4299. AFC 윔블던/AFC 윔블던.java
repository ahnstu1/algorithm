import java.util.Scanner;

class Main
{
    public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int add = sc.nextInt(),
			substract = sc.nextInt();
		
		if ((add + substract) % 2 == 0 && (add - substract) % 2 == 0 && add >= substract)
			System.out.printf("%d %d", (add + substract) / 2, (add - substract) / 2);
		else
			System.out.println("-1");
		
	}
}