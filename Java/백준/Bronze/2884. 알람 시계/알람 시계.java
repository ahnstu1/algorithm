import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(b < 45){
            a -= 1;
            b += 15;
            if(a < 0 ) a += 24;
        }else{
            b -= 45;
        }
        
        System.out.printf("%d %d", a, b);
        
    }
    
}