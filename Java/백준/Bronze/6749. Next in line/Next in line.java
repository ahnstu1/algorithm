import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int youngest = sc.nextInt(),
			middle = sc.nextInt();
		
		System.out.println(middle * 2 - youngest);
		
	}
}