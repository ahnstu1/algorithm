import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String pattern = "*",
			   pattern1 = " *";
		
		for(int i = 2; i < inputNumber; i++) {
			
			if(i % 2 == 0) {
				
				pattern += " *";
				
			}else {
				
				pattern1 += " *";
				
			}
			
		}
		
		for(int i = 0; i < inputNumber * 2; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println(pattern);
				if(inputNumber == 1) break;				
			}else {
				
				System.out.println(pattern1);
				
			}
			
		}
        
    }
    
}