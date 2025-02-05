import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		String str = "*",
			   innerBlank = " ",
			   outerBlank = "";
		
		for(int i = 1; i < inputNumber; i++) {
			
			outerBlank += " ";
			
		}
		
		System.out.println(outerBlank + str);
		
		for(int i = 1; i < inputNumber - 1; i++) {
			
			outerBlank = outerBlank.substring(1);
			System.out.println(outerBlank + str + innerBlank + str);
			innerBlank += "  ";
			
		}
		
		str = "*";
		
		for(int i = 0; i < inputNumber - 1; i++) {
			
			str += "**";
		}

		if(inputNumber != 1)System.out.println(str);
        
    }
    
}