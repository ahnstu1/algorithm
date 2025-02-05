import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber;
		
		String number;
		
		boolean result;
		
		while((inputNumber = sc.nextInt()) != 0) {
			
			number = String.valueOf(inputNumber);
			
			result = true;
			
			for(int i = 0; i < number.length() / 2; i++) {
				if(i == number.length() - i) break;
				if(number.charAt(i) != number.charAt(number.length() - i - 1)) result = false;
			}
			
			if(result) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
            
        }
        
    }
    
}