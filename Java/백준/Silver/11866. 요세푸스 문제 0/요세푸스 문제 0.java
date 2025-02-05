import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		String[] stArr = br.readLine().split(" ");
		
		
		for(int i = Integer.parseInt(stArr[0]); i > 0; i--) {
			
			dq.addFirst(i);
			
		}
		
		bw.write("<");
	
		while(dq.size() != 0) {
			
			for(int i = 1; i < Integer.parseInt(stArr[1]); i++) {
				
				dq.addLast(dq.pop());
				
			}
			
			bw.write(String.valueOf(dq.pop()));
			if(dq.size() != 0) bw.write(", ");
		}
		
		bw.write(">");
		bw.close();
        
    }
    
}