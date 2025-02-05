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
        String[] str;
        for(int i = 1; i <= a; i++){
            str = bf.readLine().split(" ");
            bw.write("Case #" + i + ": " + Integer.parseInt(str[0]) + " + " + Integer.parseInt(str[1]) + " = " + (Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + "\n");
        }
        
        bw.close();
        
    }
    
}