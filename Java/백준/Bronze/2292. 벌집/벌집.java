import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int insertNumber = sc.nextInt(),
            result = 1,
            compareNumber = 1;
        
        for(int i = 1; insertNumber > compareNumber; i++){
            
            compareNumber += (6 * i);
            
            result = i + 1;
        }
        
        System.out.println(result);
        
    }
    
}