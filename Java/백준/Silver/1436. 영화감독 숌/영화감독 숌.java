import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		String result = "666";
		
		int inputNumber = sc.nextInt(),
			breakCount = 0,
			i = 666;
		
		while(breakCount != inputNumber) {
			
			result = String.valueOf(i);
			
			if(result.indexOf("666") != -1) breakCount++;
			
			i++;
			
		}
		
		System.out.println(result);

    }
    
}