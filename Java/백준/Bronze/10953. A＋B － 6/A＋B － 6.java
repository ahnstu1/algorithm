import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        
        String[] input;
        
        for(int i = 0; i < count; i++){
            
            input = sc.next().split(",");
            
            System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
            
        }
        
    }
    
}