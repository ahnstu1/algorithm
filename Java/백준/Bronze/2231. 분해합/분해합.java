import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int input, start, compare, result;
		
		input = sc.nextInt();
		
		start = input - 9 * ((int) Math.log10(input) + 1);
		
		for(int i = start; i < input; i++) {
			
			compare = i;
			result = i;
			
			for(int j = (int) (Math.log10(input)); j > -1; j--) {
				
				result += (int) (compare / Math.pow(10, j));
				
				compare %= Math.pow(10, j);
				
			}
			
			if(input == result) {
				
				System.out.println(i);
				break;
				
			}
            
			if(i + 1 == input) System.out.println("0");		
            
		}
        
    }
    
}