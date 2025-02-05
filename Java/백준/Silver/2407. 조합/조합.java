import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

class Main{
    
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		BigInteger result = new BigInteger("1"),
				   number;
		
		int[] intArr = {Integer.parseInt(input[0]), Integer.parseInt(input[1])};
		
		for(int i = intArr[0] - intArr[1] + 1; i <= intArr[0]; i++) {
			
			number = new BigInteger(String.valueOf(i));
			result = result.multiply(number);
			
		}
		
		for(int i = 2; i <= intArr[1]; i++) {
			
			number = new BigInteger(String.valueOf(i));
			result = result.divide(number);
			
		}
		
		System.out.println(result);

	}
    
}