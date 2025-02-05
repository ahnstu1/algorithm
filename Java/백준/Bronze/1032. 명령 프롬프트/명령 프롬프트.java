import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		String[] strArr = new String[input];
		
		String result = "";
		
		boolean pardon;
		
		char pardonChar;
		
		for(int i = 0; i < input; i++) {
			
			strArr[i] = sc.next();
			
		}
		
		for(int i = 0; i < strArr[0].length(); i++) {
			
			pardon = true;
			pardonChar = strArr[0].charAt(i);
			
			for(int j = 0; j < strArr.length; j++) {
				
				if(pardonChar != strArr[j].charAt(i)) pardon = false;
				
			}
			
			if(pardon) {
				result += pardonChar;
			}else {
				result += "?";
			}
			
		}
		
		System.out.println(result);
        
    }
    
}