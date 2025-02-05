import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int treeCount = sc.nextInt(),
			needLength = sc.nextInt()
			,max = 0, mid, min;
		
        long sum;
        
		int[] treeArr = new int[treeCount];
		
		for(int i = 0; i < treeCount; i++) {
			
			treeArr[i] = sc.nextInt();
			if(max < treeArr[i]) max = treeArr[i];
			
		}
		
		min = 0;
		
		while(min <= max) {
			
			sum = 0;
			mid = (max + min) / 2;
			
			for(int i = 0; i < treeCount; i++) {
				
				if(treeArr[i] < mid) continue;
				
				sum += treeArr[i] - mid;
						
			}
			
			if(sum < needLength) {
				
				max = mid - 1;
				
			}else {
				
				min = mid + 1;
				
			}
			
		}
		
		System.out.println(max);
        
    }
    
}