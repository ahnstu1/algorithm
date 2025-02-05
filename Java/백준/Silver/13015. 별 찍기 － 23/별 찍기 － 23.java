import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String[] strArr = new String[inputNumber * 2 - 1];
		
		String pattern = "",
			   pattern1 = "**",
			   pattern2,
			   outSpace= " ",
			   inSpace ="";
		
		for(int i = 0; i < 5 + 4 * (inputNumber - 2); i++) {
			
			if(i < inputNumber || i >= 3 + 3 * (inputNumber - 2) ) {
				
				pattern += "*";
				
			}else {
				
				pattern += " ";
				inSpace += " ";
				
			}
			
		}
		
		strArr[0] = pattern;
		strArr[strArr.length - 1] = pattern;
		
		for(int i = 0; i < inputNumber - 2; i++) {
			
			pattern1 = "* " + pattern1.substring(1);
			
		}
		
		pattern2 = pattern1 + pattern1.substring(1);
		
		
		for(int i = 1; i < inputNumber - 1; i++) {
			
				inSpace = inSpace.substring(2);
				strArr[i] = outSpace + pattern1 + inSpace + pattern1;
				strArr[strArr.length - i - 1] =  outSpace + pattern1 + inSpace + pattern1;
				outSpace += " ";
				
		}
		
		strArr[inputNumber - 1] = outSpace + pattern2;
		
		for(int i = 0; i < strArr.length; i++) {
			
			System.out.println(strArr[i]);
			
		}
        
    }
    
}