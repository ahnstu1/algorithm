import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.nextLine()),
            result = 0;
        
        String str;
        
        String[] arr;
        
        for(int i = 0; i < a; i++){
            
            result = 0;
            
            str = sc.nextLine();
            
            arr = str.split("X");
            
            for(int j = 0; j < arr.length; j++){
                
                for(int k = 0; k < arr[j].length(); k++){
                    
                    result += k + 1;
                    
                }
                
            }
            
            System.out.println(result);
            
        }
        
    }
    
}