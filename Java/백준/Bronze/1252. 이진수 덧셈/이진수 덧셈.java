import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		String num1, num2, result = "", store;
		
		int pardon;
		
		boolean overflow = false;
		
		num1 = sc.next();
		num2 = sc.next();
		
		if(num1.indexOf("1") != -1) {
			num1 = num1.substring(num1.indexOf("1"));
		}else{
            num1 = "0";
        }
		if(num2.indexOf("1") != -1) {
			num2 = num2.substring(num2.indexOf("1"));
		}else{
            num2 = "0";
        }
        
        store = num1;
		
		if(num1.length() < num2.length()) {
			
			num1 = num2;
			num2 = store;
			
		}
		
		for(int i = num1.length() - 1; i > -1; i--) {
			
			if(num2.length() - (num1.length() - i) > -1) {
				
				pardon = (int) num1.charAt(i) + (int) num2.charAt(num2.length() - (num1.length() - i)) - 96;
				
			}else {
				
				pardon = (int) num1.charAt(i) - 48;
				
			}
			
			if(overflow) {
				pardon++;
				overflow = false;
			}
			
			if(pardon == 2) {
				
				overflow = true;
				pardon = 0;
				
			}
            
            if(pardon == 3) {
				
				overflow = true;
				pardon = 1;
				
			}
			
				result = String.valueOf(pardon) + result;
			
		}
		
		if(overflow) result = "1" + result;
		
		System.out.println(result);
        
    }
    
}