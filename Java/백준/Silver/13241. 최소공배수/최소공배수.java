import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long num1, num2, tmp;
		
		long multiply;
		
		num1 = sc.nextLong();
		num2 = sc.nextLong();
		multiply = num1 * num2;
		
		while(true) {
			
			tmp = num2;
			num2 = num1 % num2;
			if(num2 == 0) break;
			num1 = tmp;
			
		}
		
		System.out.println(multiply/tmp);
		
	}
    
}