import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
        for(int a = Integer.parseInt(bf.readLine()); a > 0;  a--){
            bw.write(a + "\n");
        }
        
        bw.close();
        
    }
    
}