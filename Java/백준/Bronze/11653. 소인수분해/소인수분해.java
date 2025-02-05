import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
	
	    int number = sc.nextInt(),
		    divNumber = 2;
	
	    while(number >= divNumber) {
		
		    if((number % divNumber) == 0) {
                
		    	System.out.println(divNumber);
			
			    if(number == 1) break;
			
		    	number /= divNumber;
                
		    }else {
		    	divNumber++;
		    }
		
	    }
        
    }
    
}