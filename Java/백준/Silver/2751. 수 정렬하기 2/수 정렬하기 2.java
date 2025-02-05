import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int wordCount = Integer.parseInt(br.readLine());
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < wordCount; i++) {
			
			arr.add(i, Integer.parseInt(br.readLine()));
			
		}
		
		arr.sort(Comparator.naturalOrder());
        
        for(int i = 0; i < arr.size(); i++){
            
            bw.write(String.valueOf(arr.get(i)));
            bw.newLine();
            
        }
        
        bw.close();
        
    }
    
}