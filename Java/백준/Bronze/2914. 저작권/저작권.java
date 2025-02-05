import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int song = sc.nextInt(),
			melody = sc.nextInt();
		
		System.out.println(song * (melody - 1) + 1);
		
	}
}