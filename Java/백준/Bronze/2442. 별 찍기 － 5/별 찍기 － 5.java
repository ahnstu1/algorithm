import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String str;
		
		for(int i = 1; i < inputNumber + 1; i++) {
			
			str = "";
			
			for(int j = 0; j < inputNumber - i; j++) {
				
				str += " ";
				
			}
			
					
			for(int j = i * 2 - 1; j > 0; j--) {
			
				str += "*";
			
			}			
			
			System.out.println(str);
			
		}
        
    }
    
}