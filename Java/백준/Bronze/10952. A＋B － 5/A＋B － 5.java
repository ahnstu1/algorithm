import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a,b;
        String[] str = br.readLine().split(" ");
        
        while((a = Integer.parseInt(str[0])) != 0 && (b = Integer.parseInt(str[1])) != 0){
            bw.write(Integer.parseInt(str[0]) +Integer.parseInt(str[1]) + "\n");
            str = br.readLine().split(" ");
            
        }
   
        bw.close();
    }
    
}