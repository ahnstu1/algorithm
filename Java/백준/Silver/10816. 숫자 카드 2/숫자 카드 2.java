import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> cardMap = new HashMap<String, Integer>();
		
		int cardCount = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String card;
		
		for(int i = 0; i < cardCount; i++) {
			
			card = st.nextToken();
			
			if(cardMap.get(card) == null) cardMap.put(card, 0);
			cardMap.put(card, cardMap.get(card) + 1);
			
		}
		
		cardCount = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < cardCount; i++) {
			
			card = st.nextToken();
			
			if(cardMap.get(card) == null) {
				bw.write("0 ");
			}else {
				
				bw.write(cardMap.get(card) + " ");
				
			}
			
		}
		
		bw.close();
        
    }
    
}