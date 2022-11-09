package Algorithm;

import java.util.Scanner;

//제곱근 구하기
public class Ex12_Study {
	
	// Math.sqrt 사용하는 버젼
//	class Solution {
//        public long solution(long n) {
//
//            long answer = (long)Math.sqrt(n); 
//
//            for(int i=0;i<answer;i++) {
//                if(n == answer*answer) {
//                    return (answer+1)*(answer+1);
//                }    
//            }
//            return -1;  
//        }
	
	
	
	// Math.sqrt 사용하지 않는 버젼
//	class Solution {
//		public long solution(long n) {
//		long answer = 0;
//		
//	        for(long a=1; a<=n; a++) {
//	            if(a*a==n) {
//	                answer=(a+1)*(a+1);
//	                break;
//	            }
//	        else answer = -1;
//		    } 
//	        return answer;
//	    }
//	}
	
	
	//출력버전
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long answer = 0;
	
		for (long a=1; a<=n; a++) {
	          if (n == a*a) {
	              answer = (a+1) * (a+1);
	              break;
	          }
	          else answer = -1;
	      }
	      System.out.println(answer); 
	}
    
	
}