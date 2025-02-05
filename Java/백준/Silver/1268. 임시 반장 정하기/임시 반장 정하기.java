import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int studentCount = sc.nextInt(),
			store = 0, result = 0;
		
		int[][] studentInfo = new int[studentCount][5];
		
		for(int i = 0; i < studentCount; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				studentInfo[i][j] = sc.nextInt();
				
			}
			
		}
		
		for(int i = 0; i < studentInfo.length; i++) {
			
			studentCount = 0;
			
			for(int l = 0; l < studentInfo.length; l++) {
				
				for(int j = 0; j < studentInfo[0].length; j++) {
					
					if(i == l) continue;
					
					if(studentInfo[i][j] == studentInfo[l][j]) {
						studentCount++;
						break;
					}
					
				}
				
			}
			
			if(studentCount > store) {
				
				result = i;
				store = studentCount;
				
			}
				
		}
		
		System.out.println(result + 1);
        
    }
    
}