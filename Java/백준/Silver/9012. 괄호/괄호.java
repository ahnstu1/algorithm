import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseCount = Integer.parseInt(br.readLine()),
			pardonNumber;
		
		char[] charArr;
		
		for(int i = 0; i< caseCount; i++) {
			
			pardonNumber = 0;
			
			charArr = br.readLine().toCharArray();
			
			
			for(int j = 0; j < charArr.length; j++) {
				
				if(charArr[j] == '(') {
					pardonNumber++;
				}else {
					if(pardonNumber == 0) {
						pardonNumber = -1;
						break;
					}
					pardonNumber--;
				}
				
			}
			
			if(pardonNumber != 0) {
				bw.write("NO");
			}else {
				bw.write("YES");
			}
			
			bw.newLine();
			
		}
		
		bw.close();
	}
    
}