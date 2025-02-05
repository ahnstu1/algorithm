import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int commandCount =  Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		Deque<String> deque = new ArrayDeque<String>();
		
		for(int i = 0; i < commandCount; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			
			switch(st.nextToken()) {
			
			case("push_front") :
				
				deque.addFirst(st.nextToken());
				break;
				
			case("push_back") :
				
				deque.addLast(st.nextToken());
				break;
			
			case("pop_back") :
				
				bw.write((deque.peekLast() == null ? "-1" : deque.removeLast()) + "\n");
				break;
			
			case("size") :
				
				bw.write(deque.size() + "\n");
				break;
			
			case("front") :
				
				bw.write((deque.peekFirst() == null ? "-1" : deque.getFirst()) + "\n");
				break;
			
			case("back") :
				
				bw.write((deque.peekLast() == null ? "-1" : deque.getLast()) + "\n");
				break;
			
			case("pop_front") :
				
				bw.write((deque.peekFirst() == null ? "-1" : deque.removeFirst()) + "\n");
				break;
				
			case("empty") :
				
				bw.write((deque.isEmpty() ? "1" : "0") + "\n");
				break;
				
			}
			
		}
		
		bw.close();
        
    }
    
}