import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int cardCount, purposeSum, result, sum;
		
		cardCount = sc.nextInt();
		result = cardCount;
		purposeSum = sc.nextInt();
		
		int[] arr = new int[cardCount];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				for(int k = j + 1; k < arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(purposeSum - sum < purposeSum - result && sum <= purposeSum) result = sum;
					if(result == 0) break;
				}
				
			}
			
		}
		
		System.out.println(result);
        
    }
    
}