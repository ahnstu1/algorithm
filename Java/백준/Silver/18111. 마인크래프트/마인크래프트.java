import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strArr = br.readLine().split(" ");
		
		int time, inven, min = 0, max = 0, resultTime = 0, resultHeight = 0;
		
		int[] info = new int[3],
			  heightArr;
		
		info[0] = Integer.parseInt(strArr[0]);
		info[1] = Integer.parseInt(strArr[1]);
		info[2] = Integer.parseInt(strArr[2]);

		heightArr = new int[info[0] * info[1]];
		
		for(int i = 0; i < info[0]; i++) {
			
			strArr = br.readLine().split(" ");
			for(int j = 0; j < strArr.length; j++) {
				
				heightArr[i * info[1] + j] = Integer.parseInt(strArr[j]);
				if(i == 0 && j == 0) min = heightArr[i * info[1] + j];
				if(min > heightArr[i * info[1] + j]) min = heightArr[i * info[1] + j];
				if(max < heightArr[i * info[1] + j]) max = heightArr[i * info[1] + j];
				
			}
			
		}
		
		for(int i = min; i <= max; i++) {
			
			time = 0;
			inven = info[2];
			
			for(int j = 0; j < heightArr.length; j++) {
				
				if(heightArr[j] - i > 0) {
					
					time += (heightArr[j] - i) * 2;
					inven += heightArr[j] - i;
					
				}else {
					
					time += i - heightArr[j];
					inven -= i - heightArr[j];
					
				}
				
			}
			
			if(i == min) resultTime = time;
			if(time <= resultTime && inven > -1) {
				
				resultTime = time;
				resultHeight = i;
				
			}
			
			
		}
		
		bw.append(resultTime + " " + resultHeight);
		bw.close();
		
	}
    
}