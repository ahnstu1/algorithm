import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long input = sc.nextLong();
		
		long result = 0,
			 pow = 1;
		
		String str;
		
		str = Long.toBinaryString(input);
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(str.length() - 1 - i) == '1') {
				
				result += pow;
				
			};
			
			pow *= 3;
			
		}
		
		System.out.println(result);

	}
    
}