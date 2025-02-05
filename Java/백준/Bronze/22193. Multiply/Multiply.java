import java.util.Scanner;

class Main
{
   public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		sc.nextInt();
		System.out.println(sc.nextBigInteger().multiply(sc.nextBigInteger()));
		
	} 
}