import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		for(int i = inputNumber; i > 0; i--) {
			
			for(int j = i; j > 0; j--) {
			
			
			System.out.print("*");
			
			}			
			
			System.out.print("\n");
			
		}
        
    }
    
}