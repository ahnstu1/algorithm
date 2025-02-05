import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int start, end,
			condition = 0,
			addCondition = 0,
			result = 0;
		
		
		start = sc.nextInt();
		end = sc.nextInt();
		
		loop:
		while(true) {
			
			condition++;
			
			for(int i = 0; i < condition; i++) {
			
				addCondition++;
				if(addCondition >= start && addCondition <= end) result += condition;
				if(addCondition == end) break loop;
				
			}
			
		}

		System.out.println(result);
        
    }
    
}