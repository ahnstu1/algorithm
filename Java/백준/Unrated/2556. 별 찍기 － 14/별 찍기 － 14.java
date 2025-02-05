import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String str;
		
		for(int i = 0; i < inputNumber; i++) {
			
			str = "";
			
			for(int j = 0; j < inputNumber; j++) {
				
				str += "*";
				
			}
			
			System.out.println(str);
			
		}
        
    }
    
}