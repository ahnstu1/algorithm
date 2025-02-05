import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int fixCost, cost, price, breakEvenPoint;
        
        fixCost = sc.nextInt();
        cost = sc.nextInt();
        price = sc.nextInt();
        
        if((price - cost) == 0){
            breakEvenPoint = -2;
        }else{
            breakEvenPoint = fixCost / (price - cost);
            if(breakEvenPoint < 0) breakEvenPoint = -2;
        }

        
        
        
        System.out.println(breakEvenPoint + 1);
        
        
    }
    
}