import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int orginNumber, divideNumber;
		
		String result;
		
		orginNumber = sc.nextInt();
		divideNumber = sc.nextInt();
		
		orginNumber /= 100;
		orginNumber *= 100;
		
		while(orginNumber % divideNumber != 0) {
			
			orginNumber++;
			
		}
		
		result = String.valueOf(orginNumber % 100);
		
		if(result.length() == 1) result = "0" + result;
		
		System.out.println(result);
        
    }
    
}