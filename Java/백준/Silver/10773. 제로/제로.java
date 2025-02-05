import java.util.Scanner;
import java.util.Stack;

class Main{
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int inputCount = sc.nextInt(),
			input,
			result = 0;
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < inputCount; i++) {
			
			input = sc.nextInt();
			
			if(input == 0) {
				
				st.pop();
				
			}else {
				
				st.add(input);
				
			}
			
		}
		
		while(!st.empty()) {
			
			result += st.pop();
			
		}
		
		System.out.println(result);
		
	}
    
}