import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		
		char[] charArr;
		
		int[] arr;
		
		int j;
        double result;
		
		while(true) {
			
			str = br.readLine();
			
			if(str.equals(".")) break;
			
			charArr = str.toCharArray();
			
			arr = new int[charArr.length];
			
			j = 0;
			
			
			for(int i = 1; i < charArr.length; i++) {
				
				while(j > 0 && charArr[j] != charArr[i]) {
					
					j = arr[j - 1];
					
				}
					
				if(charArr[j] == charArr[i]) {
					
					arr[i] = ++j;
					
				}
				
			}
			
			result = (double) charArr.length / (charArr.length - arr[charArr.length - 1]);
			
			if(charArr.length % result == 0 && result % 1 == 0) {
				
				bw.write(String.valueOf((int) result));
				
			}else {
				
				bw.write("1");
				
			}
			
			bw.newLine();
			
		}
		
		bw.close();
        
    }
    
}