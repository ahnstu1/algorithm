import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        String[] str;
        
        for(int i = 0; i < a; i++){
            str = br.readLine().split(" ");
            bw.write((Integer.parseInt(str[0])+Integer.parseInt(str[1]))+"\n");
        }
        
        bw.flush();
        bw.close();
    }
        
}