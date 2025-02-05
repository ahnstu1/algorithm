import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int testSetCount, roundedNumber;
		
		long sum, inputNumber;
		
		for(int i = 0; i < 3; i++) {
			
			testSetCount = sc.nextInt();
			
			sum = 0;
			roundedNumber = 0;
            
			for(int j = 0; j < testSetCount; j++) {
				
				inputNumber = sc.nextLong();
				
				if((sum < 0 && inputNumber < 0) && (sum + inputNumber > 0)) {
					
					roundedNumber--;
					sum = sum + 9223372036854775807L + inputNumber;
					
				}else if((sum > 0 && inputNumber > 0) && (sum + inputNumber < 0)){
					
					roundedNumber++;
					sum = sum - 9223372036854775807L + inputNumber;
					
							
				}else {
					
					sum += inputNumber;
					
				}
				
			}
			
			if(sum <= -9223372036854775807L) {
				roundedNumber--;
				sum = sum + 9223372036854775807L;
			}
			
			if(roundedNumber == 0 && sum == 0 || (sum == 9223372036854775807L && roundedNumber == -1)) {
				
				System.out.println(0);
				
			}else if(roundedNumber > 0 || (roundedNumber == 0 && sum > 0)) {
				
				System.out.println("+");
				
			}else {
				
				System.out.println("-");
				
			}
			
		}
        
    }
    
}