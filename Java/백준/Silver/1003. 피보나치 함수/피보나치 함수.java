import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputCount = Integer.parseInt(br.readLine()),
			input, zero, one, prevZero = 0, prevOne = 0, tmpZero, tmpOne;
		
		for(int i = 0; i < inputCount; i++) {
			
			input = Integer.parseInt(br.readLine());
			
			
			zero = 0;
			one = 0;
			prevOne = 0;
			prevZero = 0;
			
			if(input == 0) {
				
				zero = 1;
				one = 0;
				
			}else {
				
				zero = 0;
				one = 1;
				prevZero = 1;
				prevOne = 0;
				
				
			}
			
			for(int j = 2; j <= input; j++) {
				
				tmpZero = zero;
				tmpOne = one;
				zero += prevZero;
				one += prevOne;
				prevOne = tmpOne;
				prevZero = tmpZero;
				
			}
			
			bw.write((zero + " " + one));
			bw.newLine();
			
		}

		bw.close();
		
	}
    
}