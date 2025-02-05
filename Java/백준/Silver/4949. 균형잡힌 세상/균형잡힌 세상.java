import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Main{
    
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		
		char cr;
		
		Stack<Character> st;
		
		while(true) {
			
			st = new Stack<Character>();
			
			str = br.readLine();
			if(str.equals(".")) break;
			for(int i = 0; i < str.length(); i++) {
				
				cr = str.charAt(i);
				
				if(cr == '(' || cr == '[') {
					
					st.add(cr);
					
				}
				
				if(cr == ')') if(st.empty() || st.pop() != '(') {
					
					bw.write("no");
					break;
				}
				
				if(cr == ']') if(st.empty() || st.pop() != '[') {
					
					bw.write("no");
					break;
					
				}
				
				if(i == str.length() - 1) {
					
					bw.write(st.empty() ? "yes" : "no");
					
				}
					
			}
			
			bw.newLine();

		}
		
		bw.close();
		
	}
    
}