import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputCount;
		
		inputCount = sc.nextInt();
		
		int[][] arr = new int[inputCount][3];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = 1;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) arr[j][2]++;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) arr[i][2]++;
				
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i][2] + " ");
			
		}
        
    }
    
}