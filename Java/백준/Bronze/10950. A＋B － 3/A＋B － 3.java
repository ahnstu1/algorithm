import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        
        a = sc.nextInt();
        
        for(int d = 0; d < a; d++){
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println(b+c);
        }
        
    }
    
}