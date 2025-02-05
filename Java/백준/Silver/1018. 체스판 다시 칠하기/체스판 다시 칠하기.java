import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int rowCount, columnCount,
			startW, startB, result;
		
		rowCount = sc.nextInt();
		columnCount = sc.nextInt();
		result = rowCount * columnCount;
		String compare = "WBWBWBWB";
		
		String[] arr = new String[rowCount];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.next();
			
		}
		
		for(int i = 0; i < arr.length - 7; i++) {
			
			for(int k = 0; k < columnCount - 7; k++) {
				
				startW = 0;
				
				startB =0;
				
				for(int j = i; j < i + 8; j++) {
				
					for(int l = k; l < k + 8; l++) {
						
						if(j % 2 == 0 ? compare.charAt(l - k) == arr[j].charAt(l) : compare.charAt(l - k) != arr[j].charAt(l)) {
							startW++;
						}else {
							startB++;
						}
						
					}
					
				}
				
				if(result > startW) result = startW;
				if(result > startB) result = startB;
				
			}
			
		}
		
		System.out.println(result);
        
    }
    
}