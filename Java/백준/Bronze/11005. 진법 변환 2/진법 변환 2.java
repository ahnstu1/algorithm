import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int num,
			base;
	
		StringBuilder str = new StringBuilder();
		
		num = sc.nextInt();
		base = sc.nextInt();
		
		while (num != 0)
		{
			if (num % base < 10)
				str.append((char)(num % base + 48));
			else
				str.append((char)(num % base + 55));
			num /= base;
		}
		System.out.println(str.reverse());
        
    }
    
}