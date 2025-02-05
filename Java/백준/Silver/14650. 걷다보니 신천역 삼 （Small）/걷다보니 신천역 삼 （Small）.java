import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt(),
			result = 0, pardon;
		
		int[] arr = new int[inputNumber];
		
		arr[0] = 1;
		
		while(arr[0] != 3) {
			
			pardon = arr[0];
			
			arr[arr.length - 1]++;
			
			for(int i = arr.length - 1; i > 0; i--) {
				
				if(arr[i] == 3) {
					
					arr[i - 1]++;
					arr[i] = 0;
					pardon += arr[i];
					
				}else {
					
					pardon += arr[i];
					
				}
				
			}
			
			if(pardon % 3 == 0) result++;
			
		}
		
		System.out.println(result);

	}
    
}