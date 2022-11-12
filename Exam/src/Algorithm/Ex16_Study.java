package Algorithm;
//[문제] 정수 내림차순 배치하기

/*함수 solution은 정수 n을 매개변수로 입력받습니다. 
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex16_Study {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in); // [1 2 3 4 5]
			long n = sc.nextLong();
			
		    String result="";  //result 초기화   
	        String str = n+""; //기본형 long-> 문자열 String 변환 (n을 str에 저장)
	        String [] arr= str.split(""); // 문자열쪼개기
	        
	        Arrays.sort(arr, Collections.reverseOrder()); //배열 내림차순 정렬
	        
	        for(String i:arr) { //배열 arr의 요소들을 읽어옴 [5 4 3 2 1 ]
	        //		System.out.println(i); 		 //5 4 3 2 1
	        	result +=i;
	        //		System.out.println(); 
	        //		System.out.println(result);  //5  54  543  5432  54321
	        }
	        
	        System.out.println(Long.parseLong(result));
		        	
	}

}

/*
import java.util.*;

class Solution {
    public long solution(long n) {
		String result="";  
    	String str = n+"";
    	String [] arr= str.split("");

    	Arrays.sort(arr, Collections.reverseOrder()); 

     	for(String i:arr) { 
          result +=i;
     	}
             
     	return Long.parseLong(result);
    }
}
*/
