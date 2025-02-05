import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int insertNumber = Integer.parseInt(br.readLine()),
        	moveCount = 1;
        
        String[] beforeArr, printArr;
        
        printArr = new String[1];
        
        printArr[0] = "1 3";
        
        for(int i = 1; i < insertNumber; i++) {
        	
        	beforeArr = printArr;
        	
        	
        	moveCount *= 2;
        	moveCount ++;
        	
        	printArr = new String[moveCount];
        	
        	for(int j = 0; j < beforeArr.length; j++) {
        		printArr[1 + (j*2)] = beforeArr[j];
        	}
        	
        	for(int j = 0; j < printArr.length; j +=2) {
        		
        		if(i % 2 == 0) {
        			if(j % 6 == 0) printArr[j] = "1 3";
        			if(j % 6 == 2) printArr[j] = "3 2";
        			if(j % 6 == 4) printArr[j] = "2 1";
        		}else {
        			if(j % 6 == 0) printArr[j] = "1 2";
        			if(j % 6 == 2) printArr[j] = "2 3";
        			if(j % 6 == 4) printArr[j] = "3 1";
        		}
        		
        	}
        	
        }
        
        
        bw.write(String.valueOf(moveCount) + "\n");
        
        for(int i = 0; i < printArr.length; i++) {
        	
        	bw.write(printArr[i] + "\n");
        	
        }
        
        
        	
        
        bw.close();
        
    }
    
}