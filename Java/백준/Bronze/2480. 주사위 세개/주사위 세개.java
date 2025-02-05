import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int firstDice = sc.nextInt(),
			secondDice = sc.nextInt(),
			thirdDice = sc.nextInt(),
			max;
		
		max = firstDice;
		if (max < secondDice)
			max = secondDice;
		if (max < thirdDice)
			max = thirdDice;
		
		if (firstDice == secondDice && secondDice == thirdDice)
			System.out.print(10000 + firstDice * 1000);
		else if (firstDice == secondDice || firstDice == thirdDice)
			System.out.print(1000 + firstDice * 100);
		else if (secondDice == thirdDice)
			System.out.print(1000 + secondDice * 100);
		else
			System.out.print(max * 100);
		
	}
}