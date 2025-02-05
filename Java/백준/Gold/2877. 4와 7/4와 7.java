import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt(),
			originPardon = 2;
		
		String str = "", str1;
		
		while(input > 0) {
			
			input -= originPardon;
			
			originPardon *= 2;
			
			str += "4";
			
		}
		
		str1 = Integer.toBinaryString(input + originPardon/2 - 1);
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.length() - i <= str1.length()) {
				
				if(str1.charAt(str1.length() - str.length() + i) == '1') {
					
					System.out.print("7");
					continue;
					
				}
				
			}
			
			System.out.print("4");
			
		}
        
    }
    
}