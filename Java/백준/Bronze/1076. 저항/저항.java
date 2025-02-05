import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> ResistanceInfo = new HashMap<String, Integer>();
		
		ResistanceInfo.put("black", 0);
		ResistanceInfo.put("brown", 1);
		ResistanceInfo.put("red", 2);
		ResistanceInfo.put("orange", 3);
		ResistanceInfo.put("yellow", 4);
		ResistanceInfo.put("green", 5);
		ResistanceInfo.put("blue", 6);
		ResistanceInfo.put("violet", 7);
		ResistanceInfo.put("grey", 8);
		ResistanceInfo.put("white", 9);
		
		System.out.println((long) ((ResistanceInfo.get(sc.next()) * 10 + ResistanceInfo.get(sc.next())) * Math.pow(10, ResistanceInfo.get(sc.next()))));
        
    }
    
}