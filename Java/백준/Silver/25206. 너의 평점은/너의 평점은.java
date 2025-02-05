import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input;
        String[] arr;
        float score;
        float product;
        float sum = 0;
        
        score = 0;
        for (int i = 0; i < 20; i++){
        	input = br.readLine();
        	arr = input.split(" ");
        	product = Float.parseFloat(arr[1]);
        	
        	if (!arr[2].equals("P"))
        		sum += product;
        	
        	switch(arr[2]) {
	        	case "A+":	score += product * 4.5f;
	        				break;
	        	case "A0":	score += product * 4.0f;
							break;
	        	case "B+":	score += product * 3.5f;
							break;
	        	case "B0":	score += product * 3.0f;
							break;
	        	case "C+":	score += product * 2.5f;
							break;
	        	case "C0":	score += product * 2.0f;
							break;
	        	case "D+":	score += product * 1.5f;
							break;
	        	case "D0":	score += product * 1.0f;
							break;
	        	case "F0":	score += product * 0.0f;
	        				break;
	        	default:	break;
        	}
        }
        System.out.printf("%.5f", score / sum);
    }
}