import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		String input;
		
		for(int i = 0; i < 8; i++) {
			
			input = sc.next();
			
			for(int j = 0; j < input.length(); j++) {
				
				if(i % 2 == 0 ?  j % 2 == 0 && input.charAt(j) == 'F' : j % 2 == 1 && input.charAt(j) == 'F') result++;
				
			}
			
		}
		
		System.out.println(result);
        
    }
    
}