import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main{
    
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strArr;
		
		int inputCount = Integer.parseInt(br.readLine());
		
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		List<Integer> x;
		List<Integer> y;
		
		for(int i = 0; i < inputCount; i++) {
			
			strArr = br.readLine().split(" ");
			
			if(map.get(Integer.parseInt(strArr[1])) == null) map.put(Integer.parseInt(strArr[1]), new ArrayList<Integer>());
			map.get(Integer.parseInt(strArr[1])).add(Integer.parseInt(strArr[0]));
			
		}
		
		y = new ArrayList<Integer>(map.keySet());
		
		y.sort(Comparator.naturalOrder());
		
		
		for(int key : y) {
			
			x = map.get(key);
			
			x.sort(Comparator.naturalOrder());
			
			for(int i = 0; i < x.size(); i++) {
				
				bw.write(x.get(i) + " " + key + "\n");
				
			}
			
		}
		
		bw.close();
		

	}
    
}