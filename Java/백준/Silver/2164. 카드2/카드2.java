import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;


class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = size; i > 0; i--) {
			
			dq.addFirst(i);
			
		}
		
		while(dq.size() != 1) {
			
			dq.pop();
			dq.addLast(dq.pop());
			
		}
		
		bw.write(String.valueOf(dq.pop()));
		bw.close();
        
    }
    
}