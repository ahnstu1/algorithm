import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        String[] replaceStr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for(int i = 0; i < replaceStr.length; i++){
            
            str = str.replaceAll(replaceStr[i], "a");
            
        }
        
        System.out.println(str.length());
        
    }
    
}