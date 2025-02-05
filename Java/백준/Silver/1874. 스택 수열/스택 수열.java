import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

class Main{
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> st = new Stack<Integer>();
		
		StringBuilder sb = new StringBuilder();
		
		int numberCount = sc.nextInt(),
			compare = sc.nextInt();
		
		for(int i = 1; i <= numberCount; i++) {
			
			st.add(i);
			sb.append("+" + "\n");
			
			while(!st.empty() && st.peek() == compare) {
				
				st.pop();
				sb.append("-" + "\n");
				if(st.empty() && i == numberCount) break;
				compare = sc.nextInt();
				
			}
			
		}
		
		
		
		if(!st.empty()) {
			
			bw.write("NO");
					
		}else {
			
			bw.write(sb.toString());
			
		}
			
		
		bw.close();
        
    }
    
}