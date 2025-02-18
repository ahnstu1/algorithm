import java.util.Scanner;

class Main{
    
    public static void main(String[] argc){
        
        Scanner sc = new Scanner(System.in);
		
		int tc,
		    num;
		StringBuilder sb = new StringBuilder();
		
		tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			
			num = sc.nextInt();
			sb.append((char)num / 25);
			sb.append(' ');
			num %= 25;
			sb.append((char)num / 10);
			sb.append(' ');
			num %= 10;
			sb.append((char)num / 5);
			sb.append(' ');
			num %= 5;
			sb.append((char)num / 1);
			sb.append(' ');
			num %= 1;
			sb.append('\n');
		}
		System.out.println(sb);
        
    }
    
}