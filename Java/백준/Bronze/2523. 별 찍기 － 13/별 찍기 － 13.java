import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String str = "";
		
		for(int i = 0; i < inputNumber; i++) {
			
			str += "*";
			
			System.out.println(str);
			
		}
		
		for(int i = inputNumber - 1; i > 0; i--) {
			
			str = str.substring(1);
			
			System.out.println(str);
			
		}
        
    }
    
}