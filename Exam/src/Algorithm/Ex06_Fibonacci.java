package Algorithm;

import java.util.Scanner;

/* 피보나치 수열 만들기
초기값을 0 1 을 시작값으로 하고 다음 수는 바로 이전 값 2개의 합이 된다.
[입력] 
10

[출력]
1 1 2 3 5 8 13 21 34 55  
 

*/ 
public class Ex06_Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a=1;	//전전값
		int b=0;	//전값
		int c;		//현재값
	    
    	for(int i=0; i<x; i++){			//i=0  1  2  3  4  5  6  7  8  9
    		c= a+b; 					//c=1  1  2  3  5  8  13 21 34 55
    		System.out.print(c+ " "); 	//  1  1  2  3  5  8  13 21 34 55  ->출력
        	a = b;						//a=0  1  1  2  3  5  8  13 21 34
        	b = c;						//b=1  1  2  3  5  8  13 21 34 55
    	}
	}

}
