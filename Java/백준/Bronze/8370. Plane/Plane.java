import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int br = sc.nextInt(),
			bs = sc.nextInt(),
			er = sc.nextInt(),
			es = sc.nextInt();
		
		System.out.println(br * bs + er * es);
		
	}
}