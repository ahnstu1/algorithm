import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
    
        int testCaseCount = sc.nextInt()
        	,joX, joY, joR, baX, baY, baR, inCircle, OutCircle;
        
        double distance;
        
        for(int i = 0; i < testCaseCount; i++) {
        	
        	joX = sc.nextInt();
        	joY = sc.nextInt();
        	joR = sc.nextInt();
        	baX = sc.nextInt();
        	baY = sc.nextInt();
        	baR = sc.nextInt();
        	
        	distance = Math.sqrt((joX - baX) * (joX - baX) + (joY - baY) * (joY - baY));
        	
        	//두 원의 원점이 같은 경우
        	if(distance == 0) {
        		//두 원이 같은 경우 -1 반환
        		if((joR - baR) == 0) {
        			System.out.println(-1);
        		//교점이 없으니 0?
        		}else {
        			System.out.println(0);
        		}
        	//원의 반지름보다 거리가 작으면 한 원 안에 다른 원이 있다고 생각할 수 있다
        	}else if(joR > distance || baR > distance){
        		OutCircle = (joR > baR ? joR : baR);
        		inCircle = (joR > baR ? baR : joR);
        		//거리와 안쪽 원의 반지름의 합이 바깥 원의 반지름이면 접한다.
        		if((distance + inCircle) == OutCircle) {
        			System.out.println(1);
    			//거리와 안쪽 원의 반지름의 합이 바깥 원의 반지름보다 크면 두 점이 만남.
        		}else if((distance + inCircle) > OutCircle) {
        			System.out.println(2);
        		}else{
        			//교점이 없으니 0?
        			System.out.println(0);
        		};
        	//일반적인 경우
        	}else {
        		//만나는 점이 없으니 0
        		if(distance > (joR + baR)) {
        			System.out.println(0);
        		//접한다.
        		}else if(distance == (joR + baR)){
        			System.out.println(1);
        		//두점이 만난다.
        		}else {
        			System.out.println(2);
        		}
        	}
    	
        }
        
    }
    
}