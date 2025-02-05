import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt(),
			column = sc.nextInt(),
			result = 0, columnCount = 0;
		
		int[] rowPardon = new int[row],
			  columnPardon = new int[column];
		
		String castleStatus;
		
		for(int i = 0; i < row; i++) {
			
			castleStatus = sc.next();
			
			for(int j = 0; j < castleStatus.length(); j++) {
				
				if(castleStatus.charAt(j) == 'X') {
					rowPardon[i]++;
					columnPardon[j]++;
				}
				
			}
			if(rowPardon[i] == 0) result++;
		}
		
		for(int i = 0; i < columnPardon.length; i++) {
			
			if(columnPardon[i] == 0) columnCount++;
			
		}
		
		if(columnCount > result) result = columnCount;
		
		System.out.println(result);
        
    }
    
}