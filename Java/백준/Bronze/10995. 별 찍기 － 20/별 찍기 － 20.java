import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String pattern = "*",
			   pattern1 = " *";
		
		for(int i = 1; i < inputNumber; i++) {
			
			pattern += " *";
			pattern1 += " *";
			
		}
		
		for(int i = 0; i < inputNumber; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println(pattern);
				
			}else {
				
				System.out.println(pattern1);
				
			}
			
		}
        
    }
    
}