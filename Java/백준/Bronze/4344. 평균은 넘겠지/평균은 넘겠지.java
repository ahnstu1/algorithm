import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int testCaseCount = sc.nextInt(),
            testCaseDetailCount,
            avg;
        
        double overAvgCount;
        
        int[] arr;
        
        for(int i = 0; i < testCaseCount; i++){
            
            testCaseDetailCount = sc.nextInt();
            
            arr = new int[testCaseDetailCount];
            
            avg = 0;
            
            overAvgCount = 0;
            
            for(int j = 0; j < testCaseDetailCount; j++){
                
                arr[j] = sc.nextInt();
                
                avg += arr[j];
                
            }
            
            avg /= testCaseDetailCount;
            
            for(int j = 0; j < testCaseDetailCount; j++){
                
                if(arr[j] > avg) overAvgCount++;
                    
            }
            
            System.out.printf("%.3f%%\n", overAvgCount / testCaseDetailCount * 100);
            
        }
        
    }
    
}