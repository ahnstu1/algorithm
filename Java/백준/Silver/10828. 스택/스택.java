import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main{
     
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int commandCount = Integer.parseInt(br.readLine()),
			point = -1;
		
		StringTokenizer st;
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < commandCount; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			
			case "push":
			
				point++;
				arr.add(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				
				if(point == -1) {
					
					bw.write(String.valueOf(-1));
					bw.newLine();
					
				}else {
					
					bw.write(String.valueOf(arr.remove(point)));
					point--;
					bw.newLine();
					
				}
				
				break;
				
			case "size":
				
				bw.write(String.valueOf(point + 1));
				bw.newLine();
				break;
				
			case "empty":
				
				if(arr.isEmpty()) {
					
					bw.write(String.valueOf(1));
					bw.newLine();
					
				}else {
					
					bw.write(String.valueOf(0));
					bw.newLine();
					
				}
				
				break;
				
			case "top":
				
				if(point == -1) {
					
					bw.write(String.valueOf(-1));
					bw.newLine();
					
				}else {
					
					bw.write(String.valueOf(arr.get(point)));
					bw.newLine();
					
				}
				
				break;
				
			}
				
			
		}
		
		bw.close();
        
    }
    
}