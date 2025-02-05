import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int firstDice, secondDice, thirdDice,
			firstStore, secondStore, thirdStore,
			result = 0, compare = 0;
		
		firstDice = sc.nextInt();
		secondDice = sc.nextInt();
		thirdDice = sc.nextInt();
		
		firstStore = firstDice;
		secondStore = secondDice;
		thirdStore = thirdDice;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < firstDice; i++) {
			
			secondStore = secondDice;
			
			for(int j = 0; j < secondDice; j++) {
				
				thirdStore = thirdDice;
				
				for(int l = 0; l < thirdDice; l++) {
					
					if(map.get(firstStore + secondStore + thirdStore) == null) map.put(firstStore + secondStore + thirdStore, 0);
					map.put(firstStore + secondStore + thirdStore, map.get(firstStore + secondStore + thirdStore) + 1);
					thirdStore--;
					
				}
				
				secondStore--;
				
			}
			
			firstStore--;
			
		}
		
		for(int i = 3; i < firstDice * secondDice * thirdDice; i++) {
			
			if(map.get(i) != null) if(map.get(i) > compare) {
				compare = map.get(i);
				result = i;
			}
			
		}
		
		System.out.println(result);
        
    }
    
}