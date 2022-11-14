package Algorithm;

import java.util.Scanner;

//핸드폰 번호 가리기

/*
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 
전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 */
public class Ex17_Study {
	


//class Solution {
//  public String solution(String phone_number) {
//      String answer = "";
//
//        for (int i = 0; i < phone_number.length() - 4; i++)
//            answer += "*";
//
//        answer += phone_number.substring(phone_number.length() - 4); //이부분 이해가 안감.
//
//        return answer;
//  }
//}
	
	
	
	class Solution {
	    public String solution(String phone_number) {
	       
	    	char[] arr=phone_number.toCharArray();
	    	for(int i=0; i<arr.length-4; i++ ) {
	    		arr[i]='*';
	    	}
	        
	        return String.copyValueOf(arr);
	    }
	}
	
	public static void main(String[] args) {
	
	}

}
