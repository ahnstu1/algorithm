import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int	diagonal = sc.nextInt(),
			hr = sc.nextInt(),
			wr = sc.nextInt();

		double sqr = Math.sqrt(Math.pow(diagonal, 2) / (Math.pow(hr, 2) + Math.pow(wr, 2)));
		System.out.println((int) (sqr * hr) + " " + (int) (sqr * wr));
	}
}