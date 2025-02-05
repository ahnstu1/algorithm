import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int num1,
			num2 = 0,
			multiply,
			store;
		
		num1 = sc.nextInt();
		
		multiply = sc.nextInt();
		
		if(num1 < multiply) {
			
			num2 = num1;
			num1 = multiply;
			
		}else {
			
			num2 = multiply;
			
		}
		
		multiply = num1 * num2;
		
		while(num2 != 0) {
			
			store = num2;
			num2 = num1 % num2;
			num1 = store;
			
		}
		
		System.out.println(num1);
		System.out.println(multiply / num1);
        
    }
    
}