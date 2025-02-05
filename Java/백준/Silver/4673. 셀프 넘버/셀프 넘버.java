class Main{
    
    public static void main(String[] args){
        
        int[] arr = new int[10000];
        
        int result = 0;
        
        for(int i = 0; i < 10000; i++) {
        	result = selfNumber(i);
        	if(result < 10000) arr[result] = -1;
        }
        
        for(int i = 0; i < 10000; i++) {
        	if(arr[i] == 0) System.out.println(i);
        }
        
    }
    
    public static int selfNumber(int number) {
	
	    int repeatCount = (int) Math.floor(Math.log10(number)),
		                  result = number;
	
	    for(int i = 0; i < repeatCount + 1; i++) {
		
		    result += (number % 10);
		
		    number /= 10; 
		
	    }
	
	    return result;
    }
    
}