import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int deliveryKilogram = sc.nextInt(),
            count,
            result = -1;
        
        count = deliveryKilogram / 5;
        
        if(deliveryKilogram % 3 == 0) result = deliveryKilogram / 3;
        
        
        for(; count != 0; count--){
            
            if((deliveryKilogram - 5 * count) % 3 == 0){
                result = count + ((deliveryKilogram - 5 * count) / 3);
                break;
            }
            
        }
        
        System.out.println(result);
        
    }
    
}