import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String[] printArr,
				 storeArr = null;
		
		String pattern = "*****",
			   pattern1 = "*   *";
		
		if(inputNumber == 1) {
			
			printArr = new String[1];
			printArr[0] = "*";
			
		}else {
			
			printArr = new String[7];
			printArr[0] = "*****";
			printArr[1] = "*";
			printArr[2] = "* ***";
			printArr[3] = "* * *";
			printArr[4] = "* * *";
			printArr[5] = "*   *";
			printArr[6] = "*****";
			
			storeArr = printArr.clone();
			
		}
		
		if(inputNumber > 2) printArr = new String[7 + 4 * (inputNumber - 2)];
		
		for(int i = 3; i <= inputNumber; i++) {
			
			pattern += "****";
			pattern1 = "*    " + pattern1.substring(1);
			
			printArr[0] = pattern;
			printArr[1] = "*";
			printArr[7 + 4 * (i - 2) - 2] = pattern1;
			printArr[7 + 4 * (i - 2) - 1] = pattern;
			printArr[2] = "* " + storeArr[0] + "**";
			printArr[3] = "* " + storeArr[1] + pattern1.substring(3);
			
			for(int j = 4; j < 7 + 4 * (i - 2) - 2; j++) {
				
					printArr[j] = "* " + storeArr[j - 2] + " *";
				
			}
			
			storeArr = printArr.clone();
			
		}
		
		for(int i = 0; i < printArr.length; i++) {
			
			System.out.println(printArr[i]);
			
		}
        
    }
    
}