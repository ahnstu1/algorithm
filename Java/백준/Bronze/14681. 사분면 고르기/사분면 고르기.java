import java.io.*;

class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a, b;
        
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        
        if(a > 0 && b > 0){
            System.out.println("1");
        }else if(a < 0 && b > 0){
            System.out.println("2");
        }else if(a > 0 && b < 0){
            System.out.println("4");
        }else{
            System.out.println("3");
        }
        
        
        
    }
    
}