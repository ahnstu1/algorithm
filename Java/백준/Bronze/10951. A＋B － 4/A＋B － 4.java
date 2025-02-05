import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args)throws IOException{
	        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a, b;
        String str;
        String[] strArr;
        
        while((str = br.readLine()) != null){
                strArr = str.split(" ");
                bw.write(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]) + "\n");
        }
	        
        bw.close();
    }
    
}