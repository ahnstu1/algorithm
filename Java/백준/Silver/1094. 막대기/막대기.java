import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputLength = sc.nextInt(),
			stickLength = 64,
			result = 0;
		
		while(inputLength != 0) {
			
			if(stickLength > inputLength) {
				stickLength /= 2;
			}else {
				inputLength -= stickLength;
				result++;
			}
            
		}
		
		System.out.println(result);
        
    }
    
}