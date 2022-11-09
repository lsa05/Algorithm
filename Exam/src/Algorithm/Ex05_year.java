package Algorithm;

/*
[문제] 년도를 입력받아 윤년과 평년을 출력하라.
		
		1.4의 배수의 해면서 100의 배수는 아닌 경우
		2.400의 배수인 경우
		
[입력]
6						//입력받을 데이터 수
4 100 400 2000 2001 2004 

[출력]
#1 윤년
#2 평년
#3 윤년
#4 윤년
#5 평년
#6 윤년
*/	

import java.util.Scanner;

public class Ex05_year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int[] arr=new int[a];
						 
		int i; 
		int num=0;
		
		for (i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();				
			num++;
			
			if((arr[i]%4 ==0 && arr[i]%100!=0)||arr[i]%400==0) {
				System.out.println("#"+num+" 윤년");
			}else {
				System.out.println("#"+num+" 평년");
			}
		}
	}

}
