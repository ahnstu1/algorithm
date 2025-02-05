import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int summer = sc.nextInt(),
			grow   = sc.nextInt(),
			cell   = sc.nextInt(),
			price  = sc.nextInt();
		
		System.out.println((summer - 1) / grow * cell * price);
		
	}
}