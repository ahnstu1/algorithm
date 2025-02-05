import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt(),
            result = 0;
        
        String str = sc.next();
        
        for(int i = 0; i < len; i++){
            
            result += (int) str.charAt(i) - 48;
            
        }
        
        System.out.println(result);
        
    }
    
}