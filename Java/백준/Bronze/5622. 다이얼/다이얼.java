import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        int result = 0,
            compare;
        
        for(int i = 0; i < str.length(); i++){
            
            compare = (int)str.charAt(i) - 65;
            for(int j = 0; j < 5; j++){
                if(compare / 3 == j) result += j + 2;
            }
            
            if(compare == 15 || compare == 16 || compare == 17 || compare == 18) result += 7;
            if(compare == 19 || compare == 20 || compare == 21) result += 8;
            if(compare == 22 || compare == 23 || compare == 24 || compare == 25) result += 9;
            
            
        }
        
        result += str.length();
        
        System.out.println(result);
        
    }
    
}