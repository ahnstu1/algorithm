import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    
        
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double testCaseCount, x, y, realDistance, compare, commonRatio, result;

		String[] strArr;

		testCaseCount = Double.parseDouble(br.readLine());

		for (int i = 0; i < testCaseCount; i++) {

			strArr = br.readLine().split(" ");

			compare = 1;
			commonRatio = 1;
			result = 0;

			x = Double.parseDouble(strArr[0]);
			y = Double.parseDouble(strArr[1]);

			realDistance = y - x;

			while (realDistance > compare) {

					compare += commonRatio;

				if (result % 2 == 0)
					commonRatio++;

				result++;
			}

			bw.write(((int) (result + 1)) + "\n");
		}

		bw.close();

	}

}