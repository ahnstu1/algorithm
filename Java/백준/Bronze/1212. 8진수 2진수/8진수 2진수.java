import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine(),
			   result;
		
		int octal;
		
		for(int i = 0; i < str.length(); i++) {
			
			result = "";
			
			octal = Integer.parseInt(String.valueOf(str.charAt(i)));
			
			for(int j = 0; j < 3; j++) {
				result = octal % 2 + result;
				octal /= 2;
			}
			
			if(i == 0) result = String.valueOf(Integer.parseInt(result));
			
			bw.write(result);
		}
		
		bw.close();
        
    }
    
}