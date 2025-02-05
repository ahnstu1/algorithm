import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt(),
			col = sc.nextInt(),
			num = sc.nextInt();
		
		System.out.println(num / col + " " + num % col);
		
	}
}