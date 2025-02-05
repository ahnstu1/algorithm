import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    
    public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String[] arr;
		int[] numArr,
			  numArr2;
		int size,
			line,
			count;
		
        arr = br.readLine().split(" ");
        line = Integer.parseInt(arr[0]);
        count = Integer.parseInt(arr[1]);
        size =  line * count;
        numArr = new int[size];
        numArr2 = new int[size];
        
        for (int i = 0; i < line; i++){
        	arr = br.readLine().split(" ");
        	for (int j = 0; j < count; j++) {
        		numArr[count * i + j] = Integer.parseInt(arr[j]);
        	}
        }
        
        for (int i = 0; i < line; i++){
        	arr = br.readLine().split(" ");
        	for (int j = 0; j < count; j++) {
        		numArr2[count * i + j] = Integer.parseInt(arr[j]);
        	}
        }
        
        for (int i = 0; i < line; i++){
        	for (int j = 0; j < count; j++) {
        		System.out.print(numArr[count * i + j] + numArr2[count * i + j]);
        		if (j != count -1)
        			System.out.print(' ');
        	}
        	if (i != line -1)
        		System.out.println();
        }
	}
}