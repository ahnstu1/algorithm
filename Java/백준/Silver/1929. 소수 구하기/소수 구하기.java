import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	    int m, n;
	    
	    boolean check;
	    String[] str = br.readLine().split(" ");
	    
	    m = Integer.parseInt(str[0]);
	    n = Integer.parseInt(str[1]);
	    
	    for(int i = m; i <= n; i++) {
	    	
	    	check = true;
	    	
	    	if(i == 1) check = false;
	    	
	    	for(int j = 2; j < i; j++) {
	    		
                if(j > 997) break;
                
	    		if(i % j == 0){
                    check = false;   
                    break;
                }
	    		
	    	}
	    	
	    	if(check) bw.write(i + "\n");;
	    	
	    }
        
	    bw.close();
        
    }
    
}