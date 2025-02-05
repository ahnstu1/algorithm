import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int compare,
            max = 0,
            check = 0,
            result = 0;
        
        String str = sc.next();
        
        int[] arr = new int[26];
        
        for(int i = 0; i < str.length(); i++){
            
            compare = (int) str.charAt(i) - 65;
            
            if(compare > 31) compare -= 32;
            
            arr[compare]++;
            
        }
        
        for(int i = 0; i < arr.length; i++){
            
            if(max < arr[i]) max = arr[i];
            
        }
        
        for(int i = 0; i < arr.length; i++){
            
            if(max == arr[i]){
                check++;
                result = i;
            }

        }
        
        if(check == 1){
            System.out.println((char) (result + 65));
        }else{
            System.out.println("?");
        }
        
        
    }
    
}