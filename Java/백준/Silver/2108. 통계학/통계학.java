import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputCount = sc.nextInt(),
			input, mode = 0, count = 0;
		
		double sum = 0;
		
		List<Integer> numberList = new ArrayList<Integer>(),
					  mapKey, mapValue;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < inputCount; i++) {
			
			input = sc.nextInt();
			
			numberList.add(input);
			sum += input;
			if(map.get(input) == null) map.put(input, 0);
			map.put(input, map.get(input) + 1);
			
		}
		
		mapKey = new ArrayList<Integer>(map.keySet());
		mapValue = new ArrayList<Integer>(map.values());
		mapKey.sort(Comparator.naturalOrder());
		mapValue.sort(Comparator.reverseOrder());
		
		for(int key : mapKey) {
			
			if(map.get(key) == mapValue.get(0)) { 
				
				count++;
				mode = key;
				
				if(count == 2) {
					
					mode = key;
					break;
					
				}
				
			};
			
		}
		
		numberList.sort(Comparator.naturalOrder());
		
		System.out.println(Math.round(sum / inputCount));
		System.out.println(numberList.get(numberList.size() / 2));
		System.out.println(mode);
		System.out.println(numberList.get(numberList.size() - 1) - numberList.get(0));
        
    }
    
}