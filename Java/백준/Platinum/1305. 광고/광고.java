import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
 		int j = 0, panelStringLength = Integer.parseInt(br.readLine());       
        
		String str = br.readLine();
		
		char[] charArr = str.toCharArray();
		
		int[] arr = new int[charArr.length];
		
		for(int i = 1; i < charArr.length; i++) {
			
			while(j > 0 && charArr[j] != charArr[i]) {
				
				j = arr[j - 1];
				
			}
				
			if(charArr[j] == charArr[i]) {
				
				arr[i] = ++j;
				
			}
			
		}
		
		bw.write(String.valueOf(panelStringLength - arr[arr.length - 1]));
        bw.close();
    }
    
}