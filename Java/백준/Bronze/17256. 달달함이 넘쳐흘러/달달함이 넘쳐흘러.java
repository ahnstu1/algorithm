import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ax = sc.nextInt(),
			ay = sc.nextInt(),
			az = sc.nextInt(),
			cx = sc.nextInt(),
			cy = sc.nextInt(),
			cz = sc.nextInt();
		
		System.out.println(cx - az + " " + cy / ay + " " + (cz - ax));
		
	}
}