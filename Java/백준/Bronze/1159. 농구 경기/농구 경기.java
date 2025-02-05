import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int playerCount = sc.nextInt();
		
		char[] playerFirstName = new char[playerCount];
        
        boolean predaja = true;
		
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		
		for(int i = 0; i < playerCount; i++) {
			
			playerFirstName[i] = sc.next().charAt(0);
			if(count.get(playerFirstName[i]) == null) {
				count.put(playerFirstName[i], 1);
			}else {
				count.put(playerFirstName[i], count.get(playerFirstName[i]) + 1);
			}
			
		}
		
		for(int i = 0; i < 26; i++) {
			
			if(count.get((char)(i + 97)) != null && count.get((char)(i + 97)) >= 5){
              System.out.print((char)(i + 97));
              predaja = false;  
            } 
			
		}
        
        if(predaja) System.out.print("PREDAJA");
        
    }
    
}