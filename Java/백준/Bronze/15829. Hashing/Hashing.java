import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		long result = 0,
            trash = sc.nextInt();

		String str = sc.next();
		
		char[] arr = str.toCharArray();
		
		for(int i = arr.length - 1; i > -1; i--) {
            
			result += ((int) arr[i] - 96);
			if(i == 0) break;
			result *= 31;
            if(result > 1234567891) result %= 1234567891;	

		}
        
		System.out.println((int)result);
        
    }    
    
}

