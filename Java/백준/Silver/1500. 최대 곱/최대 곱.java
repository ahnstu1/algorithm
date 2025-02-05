import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number, count;
		
		number = sc.nextInt();
		count = sc.nextInt();
		
		long result = 1;
		
		int[] intArr = new int[count];
		
		while(number != 0) {
			
			for(int i = 0; i < intArr.length; i++) {
				
				intArr[i]++;
				number--;
				if(number == 0) break; 
				
			}
			
		}
		
		for(int i = 0; i < intArr.length; i++) {
			
			result *= intArr[i];
			
		}
		
		System.out.println(result);

	}
    
}