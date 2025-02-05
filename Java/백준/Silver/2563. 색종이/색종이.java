import java.util.Scanner;

class Main{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int [100][100];
		
		int cnt = sc.nextInt(),
			output = 0,
			left, below;
		
		for (int i = 0; i < cnt; i++) {
			left = sc.nextInt();
			below = sc.nextInt();
			for (int j = left; j < left + 10 ; j++) {
				for (int k = below; k < below + 10; k++) {
					arr[j - 1][k - 1] = 1;
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j] == 1)
					output++;
			}
		}
		System.out.println(output);
	}
}