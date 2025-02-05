import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(bf.readLine());
        
        for(int i = 1; i <= a; i++){
            bw.write(i + "\n");
        }
        
        bw.close();
        
    }
    
}