import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt(),
			arrLength = 1;
		
		String[] printArr = {"*"}, storeArr;
		
		String blank,
			   starPattern = "*",
			   oneStarPattern = "*",
			   inblank,
			   rightBlank,
			   leftBlank;
		
		for(int i = 2; i <= inputNumber; i++) {
			
			storeArr = printArr.clone();
			
			blank = "";
			inblank = " ";
			rightBlank = "";
			leftBlank = "";
			
			arrLength = (int) Math.pow(2, i) - 1;
			
			printArr = new String[arrLength];
			
			starPattern = starPattern + starPattern + "***";
			
			for(int j = 0; j < Math.pow(2, i - 1); j++) {
				
				blank += " ";
				
			}
			
			oneStarPattern = blank + oneStarPattern;
			
			blank = oneStarPattern.substring(0, oneStarPattern.indexOf("*"));
			
			if(i % 2 == 0) {
				
				printArr[0] = starPattern;
				printArr[printArr.length - 1] = oneStarPattern;
				
				for(int j = printArr.length - 2; j > 0; j--) {
					
					if(blank.length() > 1) blank = blank.substring(1);
					
					if(j <= printArr.length / 2) {
						
						printArr[j] = blank + "*" + leftBlank + storeArr[j - 1] + rightBlank + "*";
						rightBlank += "  ";
						leftBlank += " ";
						
					}else {
						
						printArr[j] = blank + "*" + inblank + "*";
						inblank += "  ";						
						
					}
					
				}
				
			}else {
				
				printArr[0] = oneStarPattern;
				printArr[printArr.length - 1] = starPattern;
				
				for(int j = 1; j < printArr.length - 1; j++) {
					
					if(blank.length() > 1) blank = blank.substring(1);
					
					if(j >= printArr.length / 2) {
						
						printArr[j] = blank + "*" + leftBlank + storeArr[j - printArr.length / 2] + rightBlank + "*";
						rightBlank += "  ";
						leftBlank += " ";
						
					}else {
						
						printArr[j] = blank + "*" + inblank + "*";
						inblank += "  ";
						
					}
					
				}
				
			}
			
		}
		
		for(int i = 0; i < printArr.length; i++) {
			
			System.out.println(printArr[i]);
			
		}
        
    }
    
}