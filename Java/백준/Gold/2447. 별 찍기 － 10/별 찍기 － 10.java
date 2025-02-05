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
        	   blank;
        
        double insertNumber = Double.parseDouble(str),
        		totalCount = Math.pow(insertNumber, 2);
        
        int breakCount = 9, pow = 3;
        
        
        String[] strArr
        		,printArr = new String[3];
        
        for(int i = 0; i < 9; i++) {
        	
        	if(printArr[i % 3] == null) printArr[i % 3] = "";
        	
        	if(i != 4) {
        		printArr[i % 3] += "*";
        	}else {
        		printArr[i % 3] += " ";
        	}
        	
        }
        
        while(breakCount < insertNumber * 3) {
        	
        	strArr = printArr;
        	
        	printArr = new String[breakCount];
        	
        	blank = "";
        	
        	for(int i = 0; i < breakCount / 3; i++) {
        		
        		blank += " ";
        		
        	}
        	
        	for(int i = 0; i < printArr.length; i++) {
        		
        		if(printArr[i] == null) printArr[i] = "";
        		
        		for(int j = 0; j < 3; j++) {
        				
        				if((i >= printArr.length / 3 && i < (printArr.length / 3 * 2)) && j == 1) {
        					
        					printArr[i] += blank;
        					
        				}else {
        					
        					printArr[i] += strArr[i % strArr.length];
        					
        				}
        			
        		}
        		
        	}
        	
        	breakCount = (int) Math.pow(3, pow++);
        	
        }
        
        for(int i = 0; i < printArr.length; i++) {
        	
        	bw.write(printArr[i]);
        	bw.newLine();
        	
        }
        
        bw.close();
        
    }
    
    
}