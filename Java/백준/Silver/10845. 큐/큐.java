import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
   
    public static int[] queue;
	public static int rear = 0;
	public static int front = 0;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int commandCount = Integer.parseInt(br.readLine()),
			rear = 0, front = 0;
		
		queue = new int[commandCount];
		
		for(int i = 0; i < commandCount; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			
			case ("push") :
				
				push(Integer.parseInt(st.nextToken()));
				break;
			
			case ("pop") :
				
				bw.write(pop() + "\n");
				break;
				
			
			case ("size") :
				
				bw.write(size() + "\n");
				break;
			
			case ("empty") :
				
				bw.write(empty() + "\n");
			break;
			
			case ("front") :
				
				bw.write(front() + "\n");
				break;
			
			case ("back") :
				
				bw.write(back() + "\n");
				break;
			
			}
			
		}
		
		bw.close(); 
        
    }
    
	public static void push(int number) {
		
		queue[rear] = number;
		
		rear++;
		
	}
	
	public static String pop() {
		
		return String.valueOf(front < rear ? queue[front++] : -1);
		
	}
	
	public static String size() {
		
		return String.valueOf(rear - front);
		
	}
    
	public static String empty() {
		
		return String.valueOf(rear - front == 0 ? 1 : 0);
		
	}
    
	public static String front() {
		
		return String.valueOf(front == rear ? -1 : queue[front]);
		
	}
    
	public static String back() {
		
		return String.valueOf(rear - 1 < front ? -1 : queue[rear - 1]);
		
	}
    
}