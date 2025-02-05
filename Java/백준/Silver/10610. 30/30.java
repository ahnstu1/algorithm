import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		String input = sc.next(),
			   result = "";

		int sum = 0,
			charAt;
		
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < 10; i++) {
			
			numberMap.put(i, 0);
			
		}
		
		for(int i = 0; i < input.length(); i++) {
			
			charAt = input.charAt(i) - 48;
			
			sum += charAt;
			
			numberMap.put(charAt, numberMap.get(charAt) + 1);
			
		}
		
		for(int i = 9; i > -1; i--) {
			
			if(numberMap.get(0) == 0) break;
			
			for(int j = 0; j < numberMap.get(i); j++) {
				
				result += i;
				
			}
			
		}
		
		System.out.println(result.length() == 0 || sum % 3 !=0 ? -1 : result);
        
    }
    
}