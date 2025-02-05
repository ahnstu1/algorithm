import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int floor, roomPerFloor, guest,
        	testCaseCount = sc.nextInt();
        
        String roomNumber;
        
        for(int i = 0; i < testCaseCount; i++){
            
            floor = sc.nextInt();
            roomPerFloor = sc.nextInt();
            guest = sc.nextInt();
            
            	
            	roomNumber = String.valueOf(guest / floor + 1);
            
            if((guest / floor + 1) < 10) roomNumber = "0" +  roomNumber;
            
            if(guest % floor == 0) {
            	
            	System.out.println(Integer.parseInt(floor + roomNumber) - 1);
            	
            }else {
            	
            	System.out.println(guest % floor + roomNumber);
            	
            }
        
        }
    }
    
}