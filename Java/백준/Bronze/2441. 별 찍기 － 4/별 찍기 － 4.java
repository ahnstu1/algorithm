import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String str;
		
		for(int i = inputNumber; i > 0; i--) {
			
			str = "";
					
			for(int j = i; j > 0; j--) {
			
				str += "*";
			
			}			
			
			System.out.printf("%" + (inputNumber + 1) +"s", str + "\n");
			
		}
        
    }
    
}