import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a, max, min;
        
        a = Integer.parseInt(br.readLine());
        
        String[] arr = br.readLine().split(" ");
                                           
        max = Integer.parseInt(arr[0]);
        min = Integer.parseInt(arr[0]);
                                           
        for(int i = 0; i < a; i++){
            if(max < Integer.parseInt(arr[i])) max = Integer.parseInt(arr[i]);
            if(min > Integer.parseInt(arr[i])) min = Integer.parseInt(arr[i]);
        }
        
        bw.write(min + " " + max);
        bw.close();
        
        
    }
    
}