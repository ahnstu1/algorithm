import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int sum, countNum, repeatCount;
        
        int countArr[] = new int[10];
        
        sum = sc.nextInt() * sc.nextInt() * sc.nextInt();
        
        repeatCount = (int) Math.floor(Math.log10(sum)) + 1;
        
        for(int i = 0; i < repeatCount; i++){
            
            countNum = sum % 10;
            
            countArr[countNum]++;
            
            sum /= 10;
            
        }
        
        for(int i = 0; i < countArr.length; i++){
            System.out.println(countArr[i]);       
        }

    }
    
}