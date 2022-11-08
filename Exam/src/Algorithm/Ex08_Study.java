package Algorithm;

import java.util.Scanner;

//약수합구하기
public class Ex08_Study {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int answer=0;
		
			for(int i=1; i<=n; i++) {
				if(n<=3000 && n%i==0) {
					answer+=i;
				}
			}System.out.println(n+"의 약수는"+ answer +"입니다.");
		}
	
/*	
 	//(num/2)까지만 for문을 돌려서 answer+num하는 방법 
  
	 int answer = 0;
     for(int i = 1; i <= num/2; i++){
    	 if(num%i == 0) answer += i;
     	}
     return answer+num;
	}
	
*/
	
}
