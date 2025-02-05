import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double insertNumber = sc.nextInt();
        
        System.out.printf("%.6f\n", insertNumber * insertNumber * Math.PI);
        System.out.printf("%.6f\n", insertNumber * insertNumber * 2);
        
    }
    
}