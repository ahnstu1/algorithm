import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int coordinateCount = Integer.parseInt(br.readLine()),
			key;
			
		StringTokenizer st;
		
		Map<Integer, ArrayList<Integer>> coordinateMap = new HashMap<Integer, ArrayList<Integer>>();
		List<Integer> keyMap;
		
		for(int i = 0; i < coordinateCount; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			key = Integer.parseInt(st.nextToken());
			
			if(coordinateMap.get(key) == null) coordinateMap.put(key, new ArrayList<Integer>());
			
			coordinateMap.get(key).add(Integer.parseInt(st.nextToken()));
			
		}
		
		keyMap = new ArrayList<Integer>(coordinateMap.keySet());
		
		Collections.sort(keyMap);
		
		for(int mapKey : keyMap) {
			
			coordinateMap.get(mapKey).sort(Comparator.naturalOrder());
			
			for(int i = 0; i < coordinateMap.get(mapKey).size(); i++) {
				
				bw.write(mapKey + " " + coordinateMap.get(mapKey).get(i) + "\n");
				
			}
			
		}
		
		bw.close();
        
    }
    
}