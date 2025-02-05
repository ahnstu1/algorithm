import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int testCaseCount, floor, room;
        
        int[] roomPerFloor;
        
        testCaseCount = sc.nextInt();
        
        for(int i = 0; i < testCaseCount; i++){
            
            floor = sc.nextInt();
            room = sc.nextInt();
            
            roomPerFloor = new int[room];
            
            for(int j = 0; j < roomPerFloor.length; j++){
                roomPerFloor[j] = j + 1;
            }
            
            for(int j = 0; j < floor; j++){
                
                for(int k = room - 1; k != 0; k--){
                    for(int l = 0; l < k; l++ ){
                        roomPerFloor[k] += roomPerFloor[l];    
                    }
                    
                }
                
            }
            
            System.out.println(roomPerFloor[room - 1]);
            
        }
        
    }
    
}