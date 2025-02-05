import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, 
			idx = 0,
			max = 0;
		
		
		for (int i = 0; i < 81; i++) {
			num = sc.nextInt();
			if (max < num) {
				max = num;
				idx = i;
			}
		}
		System.out.println(max);
		System.out.printf("%d %d", idx / 9 + 1, idx % 9 + 1);
	}
    
}