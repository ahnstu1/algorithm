import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		if (input % 5 == 0)
			System.out.println(input / 5);
		else
			System.out.println(input / 5 + 1);
	}
}