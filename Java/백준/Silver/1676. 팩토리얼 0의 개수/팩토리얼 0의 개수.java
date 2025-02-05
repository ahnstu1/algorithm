import java.math.BigInteger;
import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt(),
			result = 0,
			num;
		
		for(int i = input; i > 1; i--) {
			
			num = i;
			
			while(num % 5 == 0) {
				
				num /= 5;
				result++;
				
			}
			
		}
		
		System.out.println(result);
		
	}
    
}