import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int address = -1,
			result;
		
		while(true) {
			
			address = sc.nextInt();
			
			if(address == 0) break;
			
			result = 1;
			
			while(address != 0) {
				
				if(address % 10 == 1) {
					result += 2;
				}else if(address % 10 == 0) {
					result += 4;
				}else {
					result += 3;
				}
				
				address /= 10;
				
				result++;
				
			}
			
			System.out.println(result);
            
        }
        
    }
    
}