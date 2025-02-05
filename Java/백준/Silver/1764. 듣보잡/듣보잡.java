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
		
		String[] input = br.readLine().split(" ");
		
		String str;
		
		Map<String, Integer> neverHeardName = new HashMap<String, Integer>();
		List<String> neverSawHeardName = new ArrayList<String>();
		
		for(int i = 0; i < Integer.parseInt(input[0]); i++) {
			
			neverHeardName.put(br.readLine(), 0);
			
		}
		
		for(int i = 0; i < Integer.parseInt(input[1]); i++) {
			str = br.readLine();
			if(neverHeardName.get(str) != null) neverSawHeardName.add(str);
			
		}
		
		neverSawHeardName.sort(Comparator.naturalOrder());
		bw.write(neverSawHeardName.size() + "\n");
        
		for(int i = 0; i < neverSawHeardName.size(); i++) {
			
			bw.write(neverSawHeardName.get(i));
			bw.newLine();
			
		}
				
		bw.close();
		
	}
    
}