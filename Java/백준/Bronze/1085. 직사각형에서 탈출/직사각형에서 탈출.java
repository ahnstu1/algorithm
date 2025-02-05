import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int result = 1001;
        
        String[] arr  = sc.nextLine().split(" ");
        
        int[] intArr = new int[6];
        
        for(int i = 0; i < arr.length; i++) {
        	
        	intArr[i+2] = Integer.parseInt(arr[i]);
        	
        }
        
        for(int i = 0; i < 4; i++) {
        	
        	if(result > Math.abs(intArr[i] - intArr[i + 2])) result = Math.abs(intArr[i] - intArr[i + 2]);
        	
        }
        
        System.out.println(result);
        
    }
    
}