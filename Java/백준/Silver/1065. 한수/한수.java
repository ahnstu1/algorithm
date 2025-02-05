import java.util.Scanner;

public class Main {
    
        
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int insertNumber = sc.nextInt(),
			result = 0;
		
		for(int i = 1; i < insertNumber + 1; i++) {
			
			if(hanNumber(i)) result++;
			
		}
		
		System.out.println(result);
    }
	
	public static boolean hanNumber(int number) {
		
		if(number < 10) return true;
		
		int repeatCount = (int) Math.floor(Math.log10(number));
		if(number != 100 && (repeatCount == 0 || repeatCount == 1)) return true;
		
		int[] arr = new int[repeatCount + 1];
		
		arr[2] = number / 100;
		number %= 100;
		arr[1] = number / 10;
		number %= 10;
		arr[0] = number; 
		
		return arr[0] - arr[1] == arr[1] - arr[2];
	}



}