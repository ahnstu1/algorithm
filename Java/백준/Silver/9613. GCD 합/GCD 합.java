import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCaseCount = sc.nextInt(),
			inputCount, x, y, tmp;
        
		long result;
        
		int[] intArr;
		
		for(int i = 0; i < testCaseCount; i++) {
			
			inputCount = sc.nextInt();
			result = 0;
			
			intArr = new int[inputCount];
			
			for(int j = 0; j < intArr.length; j++) {
				
				intArr[j] = sc.nextInt();
				
			}
			
			for(int j = 0; j < intArr.length; j++) {
				
				
				for(int k = j + 1; k < intArr.length; k++) {
					
					x = intArr[j];
					y = intArr[k];
					
					while(true){
						
						tmp = y;
						y = x % y;
						x = tmp;
						if(y == 0) break;
						
					}
					
					result += tmp;
					
				}
				
			}
			
			System.out.println(result);
			
		}
		
	}
    
}