import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[] input = br.readLine().split(" ");
		
		long makeLanCable, max = 0, mid, min;
		
		int[] lan = new int[Integer.parseInt(input[0])];
		
		for(int i = 0; i < Integer.parseInt(input[0]); i++) {
			
			lan[i] = Integer.parseInt(br.readLine());
			if(lan[i] > max)  max = lan[i];
			
		}
		
		
		mid = 0;
		min = 1;
		
		while(min <= max) {
			
			makeLanCable = 0;
			
			mid = (max + min) / 2;
			
			for(int i = 0; i < lan.length; i++) {
				
				makeLanCable += lan[i] / mid;
				
			}
			
			if(makeLanCable < Integer.parseInt(input[1])) {
				
				max = mid - 1;
				
			}else {
				
				min = mid + 1;
				
			}
			
		}

		bw.write(String.valueOf((max)));
		bw.close();

    }
    
}