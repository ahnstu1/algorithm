import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a,b, result = "";
        
        a = sc.next();
        b = sc.next();
        
        int[] aArr, bArr, printArr;
        
        aArr = new int[a.length()];
        bArr = new int[b.length()];
        printArr = new int[a.length() > b.length() ? a.length() + 1 : b.length() + 1];
        
        for(int i = 0; i < a.length(); i++) {
        	
        	aArr[i] = Integer.parseInt(Character.toString(a.charAt(a.length() - i - 1)));
        	
        }
        
        for(int i = 0; i < b.length(); i++) {
        	
        	bArr[i] = Integer.parseInt(Character.toString(b.charAt(b.length() - i - 1)));
        	
        }
        
        if(a.length() > b.length()) {
        	
        	 for(int i = 0; i < a.length(); i++) {
        		 
        		 printArr[i] = aArr[i];
        		 
        	 }
        	 
        	 for(int i = 0; i < b.length(); i++) {
             	
             	printArr[i] += bArr[i];
             	
             }
        	
        }else {
        	
        	for(int i = 0; i < b.length(); i++) {
       		 
       		 printArr[i] = bArr[i];
       		 
       	 	}
        	
        	for(int i = 0; i < a.length(); i++) {
            	
            	printArr[i] += aArr[i];
            	
            }
        	
        }
        
        for(int i = 0; i < printArr.length; i++) {
        	
        	if(printArr[i] >= 10) {
        		printArr[i + 1] += 1;
        		printArr[i] -= 10;
        	}
        	
        }
        
        for(int i = 0; i < printArr.length; i++) {
        	if(i == 0) if(printArr[printArr.length - i - 1] == 0) continue;
        	result += printArr[printArr.length - i - 1];
        	
        }
        
        System.out.println(result);
        
    }
    
}