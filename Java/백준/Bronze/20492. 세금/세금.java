import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		
		System.out.print((int) (price * 0.78) + " " + (int) (price * 0.956));
		
	}
}