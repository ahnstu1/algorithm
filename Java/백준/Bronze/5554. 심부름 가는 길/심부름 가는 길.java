import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		for (int i = 0; i < 4; i++)
			result += sc.nextInt();
		
		System.out.println(result / 60);
		System.out.println(result % 60);
	}

}