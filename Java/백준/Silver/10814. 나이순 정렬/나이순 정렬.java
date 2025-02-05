import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main{
    
    public static void main(String[] args) throws IOException {        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int memberCount = Integer.parseInt(br.readLine()),
			key;
		
		StringTokenizer st;
		
		Map<Integer, ArrayList<String>> memberMap = new HashMap<Integer, ArrayList<String>>();
		
		
		for(int i = 0; i < memberCount; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			key = Integer.parseInt(st.nextToken());
			
			if(memberMap.get(key) == null) memberMap.put(key, new ArrayList<String>());
			
			memberMap.get(key).add(st.nextToken());
			
		}
		
		for(Integer memberKey : memberMap.keySet()) {
			
			for(int i = 0; i < memberMap.get(memberKey).size(); i++) {
				
				bw.write(memberKey + " " +memberMap.get(memberKey).get(i) + "\n");
				
			}
			
		}
		
		bw.close();
        
    }
    
}