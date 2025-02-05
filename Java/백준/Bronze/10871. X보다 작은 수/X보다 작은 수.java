import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = bf.readLine().split(" ");
        
        String[] numArr = bf.readLine().split(" ");
        
        for(int i = 0; i < Integer.parseInt(str[0]); i++){
            if(Integer.parseInt(numArr[i]) < Integer.parseInt(str[1])) bw.write(numArr[i] + " ");
        }
        
        bw.close();
        
    }
    
    
}