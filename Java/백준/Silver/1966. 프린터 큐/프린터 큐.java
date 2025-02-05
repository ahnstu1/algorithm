import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int testCaseCount = sc.nextInt(),
			documentCount, document, input, condition, result;
		
		Queue<Integer> q;
		
		List<Integer> importance;
		
		for(int i = 0; i < testCaseCount; i++) {
            
			q = new LinkedList<>();
			importance = new ArrayList<Integer>();
			documentCount = sc.nextInt();
			document = sc.nextInt();
			condition = 0;
			result = 0;
			
			for(int j = 0; j < documentCount; j++) {
				
				input = sc.nextInt();
				
				q.add(input);
				importance.add(input);
				
			}
			
			importance.sort(Comparator.reverseOrder());
			
			while(q.size() != 0) {
				
				if(q.peek() == importance.get(0)) {
					
					q.poll();
					importance.remove(0);
					result++;
					if(document == 0) break;
					document--;
					
				}else {
					
					q.add(q.poll());
					if(document == 0) {
						
						document += q.size() - 1;
						
					}else {
						
						document--;
						
					}
					
				}
				
			}
			
			System.out.println(result);
			
		}
        
    }
    
}