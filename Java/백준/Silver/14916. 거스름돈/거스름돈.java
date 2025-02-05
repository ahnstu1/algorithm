import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int input, result = 0;
		
		input = sc.nextInt();
		
		while(input != 0) {
			
			if(input < 2) {
				
				result = -1;
				break;
				
			}
			
			if((input - 5) % 2 == 0 || input / 5 >= 2) {
				
				input -= 5;
				result++;
				
			}else {
				
				input -= 2;
				result++;
				
			}
			
			
		}
		
		System.out.println(result);
        
    }
    
}