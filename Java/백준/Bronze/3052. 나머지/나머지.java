import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int result = 10;
        
        int[] arr = new int[10];
        
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = sc.nextInt() % 42;
            
        }
        
        for(int i = 0; i < arr.length; i++){
            
            if(i > 0) if(arr[i - 1] == -1) result--;
            
            for(int j = i + 1; j < arr.length; j++){
                
                if(arr[i] == arr[j]) arr[j] = -1;
            }
            
        }
        
        if(arr[9] == -1) result--;
        
        System.out.println(result);
        
    }

}