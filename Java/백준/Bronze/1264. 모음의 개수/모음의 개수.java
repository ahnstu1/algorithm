import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		int result = -1;
		
		char[] vowel = {'A', 'E', 'I', 'O', 'U'};
		
		while(!str.equals("#")) {
			
			if(result != -1) System.out.println(result);
			
			result = 0;
			
			str = sc.nextLine();
			
			str = str.toUpperCase();
			
			for(int i = 0; i < str.length(); i++) {
				
				for(int j = 0; j < vowel.length; j++) {
					if(vowel[j] == str.charAt(i)) result++;
				}
				
			}
		}
        
    }
    
}