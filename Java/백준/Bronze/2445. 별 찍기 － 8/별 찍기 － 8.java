import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String str;
		
		for(int i = 0; i < inputNumber; i++) {
			
			str = "";
			
			for(int j = 0; j < inputNumber * 2; j++) {
				
				if(j <= i || i >= inputNumber * 2 - 1 - j) {
					
					str += "*";
					
				}else {
					
					str += " ";
					
				}
				
			}
			
			System.out.println(str);
			
		}
		
		for(int i = inputNumber - 2; i > -1; i--) {
			
			str = "";
			
			for(int j = 0; j < inputNumber * 2; j++) {
				
				if(j <= i || i >= inputNumber * 2 - 1 - j) {
					
					str += "*";
					
				}else {
					
					str += " ";
					
				}
				
			}
			
			System.out.println(str);
			
		}
        
    }
    
}