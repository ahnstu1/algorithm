import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int wordCount = Integer.parseInt(br.readLine());
		
		List<String> wordList = new ArrayList<String>();
		
		for(int i = 0; i < wordCount; i++) {
			
			wordList.add(br.readLine());
			
		}
		
		Collections.sort(wordList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() > o2.length()) {
					
					return 1;
					
				}else if(o1.length() == o2.length()) {
					
					return o1.compareTo(o2);
					
				}else {
					
					return -1;
					
				}
				
			}
		
		});
		
		
		for(int i = 0; i < wordList.size(); i++) {
            
			if(i > 0) if(wordList.get(i - 1).equals(wordList.get(i))) continue;	
            
			bw.write(wordList.get(i) + "\n");
			
		}
		
		bw.close();
        
    }
    
}