import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        double max = 0, avg = 0;
        
        int[] arr = new int[a];
        
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]) max = arr[i];
        }
        
        for(int i = 0; i < a; i++){
            avg += arr[i] / max * 100;
        }
        
        System.out.println(avg / a);
        
    }
    
}