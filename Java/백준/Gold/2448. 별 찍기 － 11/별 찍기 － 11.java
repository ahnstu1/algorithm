import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
       Scanner sc = new Scanner(System.in);
		
		int lineCount = sc.nextInt();
		
		String[] printArr = {"*", "* *", "*****"},
				 storeArr;
		
		String space = " ";
		
		storeArr = printArr;
		
		
		for(int i = 2; i <= lineCount / 3; i *= 2) {
			
			printArr = new String[lineCount];
			
			for(int j = 0; j < i * 3; j++) {
				
				space += " ";
				
			}
			
			for(int j = 0; j < i * 3; j++) {
				
				if(j >= i * 3 / 2) {
					
					space = space.substring(2);
					
					printArr[j] = storeArr[j % (i * 3 / 2)] + space + storeArr[j % (i * 3 / 2)];
					
				}else {
					
					printArr[j] = storeArr[j];
					
				}
				
				
			}
			
			storeArr = printArr;
			
		}
		
		if(space.equals("")) space = " ";
		
		for(int i = 1; i < lineCount; i++) {
			
			space += " ";
			
		}
		
		for(int i = 0; i < printArr.length; i++) {
			
			space = space.substring(1);
			
			System.out.println(space + printArr[i] + space);
			
		} 
        
    }
    
}