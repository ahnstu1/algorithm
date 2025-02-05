import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        a = sc.nextInt();
        b = 0;
        
        for(int c = 1; c <= a; c++){
            b += c;
        }
        
        System.out.println(b);
        
    }
}