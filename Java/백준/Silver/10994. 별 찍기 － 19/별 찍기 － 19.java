import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String[] printArr = new String[inputNumber * 4 - 3],
				 storeArr;
	
		String pattern1,
			   pattern2;
		
		printArr[0] = "*";
		
		storeArr = printArr.clone();
		
		for(int i = 1; i < inputNumber; i++) {
			
			pattern1 = "";
			pattern2 = "";
			
			for(int j = 0; j < (i + 1) * 4 - 3; j++) {
				
				pattern1 += "*";
				
				if(j == 0 || j == ((i + 1) * 4 - 4)) {
					
					pattern2 += "*";
					
					
				}else {
					
					pattern2 += " ";
					
				}
				
			}
			
			printArr[0] = pattern1;
			printArr[1] = pattern2;
			printArr[i * 4] = pattern1;
			printArr[i * 4 - 1] = pattern2;
			for(int j = 2; j < i * 4 - 1; j++) {
				
				printArr[j] = "* " + storeArr[j - 2] + " *";
				
			}
			
			storeArr = printArr.clone();
			
		}
		
		for(int i = 0; i < printArr.length; i++) {
			
			System.out.println(printArr[i]);
			
		}
        
    }
    
}