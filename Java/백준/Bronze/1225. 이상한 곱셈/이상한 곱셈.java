import java.util.Scanner;

class Main{
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
		
		long result,
			num1Total = 0,
			num2Total = 0;
		
		String num1, num2;
		
		num1 = sc.next();
		num2 = sc.next();
		
		for(int i = 0; i < num1.length(); i++) {
			
			num1Total += Integer.parseInt(String.valueOf(num1.charAt(i)));
			
		}
		
		for(int i = 0; i < num2.length(); i++) {
			
			num2Total += Integer.parseInt(String.valueOf(num2.charAt(i)));
			
		}
		
		System.out.println(num1Total * num2Total);
        
    }
    
}