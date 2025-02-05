import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main{
    
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCount = Integer.parseInt(br.readLine());
		
		int[] numberArr = new int[inputCount];
		
		
		for(int i = 0; i < inputCount; i++) {
			
			numberArr[i] = Integer.parseInt(br.readLine());
			
		}
		
		Arrays.sort(numberArr);
		
		for(int i = 0; i < numberArr.length; i++) {
			
			bw.write(numberArr[i] + "\n");
			
		}
		
		bw.close();

	}
    
}