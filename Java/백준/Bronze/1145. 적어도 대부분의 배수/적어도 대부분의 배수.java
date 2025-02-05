import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int result = 100, pardon = 0;
		
		for(int i = 0; i < 5; i++) {
			
			arr[i] = sc.nextInt();
			if(result > arr[i]) result = arr[i];
			
		}
		
		while(pardon < 3) {
			
			pardon = 0;
			
			
			for(int i = 0; i < arr.length; i++) {
				
				if(result % arr[i] == 0) pardon++;
				
			}
			
			result++;
			
		}
		
		System.out.println(result - 1);
        
    }
    
}