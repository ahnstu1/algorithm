import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        
        int max = 0
            ,count = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = sc.nextInt();
            
            if(max < arr[i]){
                max = arr[i];
                count = i + 1;
            }
            
        }
        
        System.out.println(max);
        System.out.println(count);
        
    }
        
}
