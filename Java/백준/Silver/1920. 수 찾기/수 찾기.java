import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		String token;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < count; i++) {
			
			token = st.nextToken();
			
			if(map.get(token) == null) map.put(token, 0);
			
		}
		
		count = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < count; i++) {
			
			token = st.nextToken();
				
			bw.write(map.get(token) != null ? "1" : "0");
			bw.newLine();
			
			
		}
		
		bw.close();
        
    }
    
}