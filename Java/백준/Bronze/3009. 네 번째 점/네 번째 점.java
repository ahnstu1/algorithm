import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[6],
        			x, y;
        
        x = new int[2];
        y = new int[2];
        
        
        
        int otherX = 0,
        	otherY = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	
        	arr[i] = sc.nextInt();
        	
        }
        
        x[0] = arr[0];
        y[0] = arr[1];
        
        for(int i = 2; i < 5; i += 2) {
        	
        	if(x[0] == arr[i]) {
        		x[1]++;
        	}else {
        		otherX = arr[i];
        	}
        	if(y[0] == arr[i+1]) {
        		y[1]++;
        	}else {
        		otherY = arr[i+1];
        	}
        	
        }
        
        if(x[1] == 1) {
        	System.out.print(otherX + " ");
        }else {
        	System.out.print(x[0] + " ");
        }
        if(y[1] == 1) {
        	System.out.print(otherY + " ");
        }else {
        	System.out.print(y[0] + " ");
        }
        
    }
    
}