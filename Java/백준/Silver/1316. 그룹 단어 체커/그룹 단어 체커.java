import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int insertWord = sc.nextInt(),
            answer = 0,
            strArrLength;
        
        String word;
        
        char compare;
        
        boolean check;
        
        String[] strArr;
        
        for(int i = 0; i < insertWord; i++){
            
            check = true;
            
            word = "A" + sc.next() + "A";
            
            for(int j = 0; j < 26; j++){
            	
                compare = (char) (97 + j);
                
                strArr = word.split(Character.toString(compare));
                
                strArrLength = strArr.length;
                
                if(strArrLength == 2) continue;
                
                for(int k = 0; k < strArr.length; k++) {
                	
                	
                	if(strArr[k].isEmpty()) strArrLength-- ;
                	
                }
                
                if(!(strArrLength == 2 || strArrLength == 1)) check = false; 
                
            }
            
            if(check) answer++;
            
        }
        
        System.out.println(answer);
        
    }
    
}