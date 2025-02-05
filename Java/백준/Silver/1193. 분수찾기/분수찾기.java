import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int insertNumber = sc.nextInt(),
        	compareNumber = 0,
        	addNumber = 1,
        	th;
        
        while(compareNumber < insertNumber) {
        	
        	compareNumber += addNumber++;
        	
        }
        
        th = (insertNumber - compareNumber + addNumber - 1);
        
        if(insertNumber == 1) {
        	System.out.println("1/1");
        }else{
        	if((addNumber - 1) % 2 == 0) {
        		System.out.println(th + "/" + (addNumber - th));
        	}else {
        		System.out.println((addNumber - th) + "/" + th);
        	}
        };
    
    }
}