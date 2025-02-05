import java.util.Scanner;

class Main{
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		int sum = 0,
			num;
		for (int i = 0; i < str[0].length(); i++) {
			num = (int)str[0].charAt(i);
			if (num > 64)
				num -= 55;
			if (num > 47)
				num -= 48;
			sum += num * Math.pow(Double.parseDouble(str[1]), str[0].length() - 1 - i);
		}
		System.out.println(sum);
	}
}
