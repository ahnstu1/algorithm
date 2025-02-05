import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        for(int i = 0; i < 26; i++){
            
            System.out.print(str.indexOf(i+97) + " ");
            
        }
        
    }
    
}