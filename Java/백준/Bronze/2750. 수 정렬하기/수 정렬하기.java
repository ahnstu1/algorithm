import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int wordCount = Integer.parseInt(br.readLine());
		int[] wordArr = new int[wordCount];
		int store;
		for(int i = 0; i < wordCount; i++) {
			
			wordArr[i] = Integer.parseInt(br.readLine());
			
		}
		
		for(int i = 0; i < wordArr.length; i++) {
			
			store = wordArr[i];
			
			for(int j = i + 1; j < wordArr.length; j++) {
				
				if(wordArr[i] > wordArr[j]) {
					
					wordArr[i] = wordArr[j];
					wordArr[j] = store;
					store = wordArr[i];
					
				}
					
				
			}
			
		}
		
		for(int i = 0; i < wordArr.length; i++) {
			
			bw.write(wordArr[i] + "\n");
			
		}
		
		bw.close();
		
	}
    
}