package Algorithm;
//자릿수 합 구하기
public class Ex09_Study {

	public class Solution {
	    public int solution(int n) {
	    	String str=String.valueOf(n);			//String 변환
	    	String[]arr=str.split("");				//""단위로 쪼개서 배열에 저장
	        int answer = 0;
	        
	        for(int i=0;i<arr.length;i++) {
	        	answer+=Integer.parseInt(arr[i]);	//배열의 구성요소를 정수로 바꿔서 합 연산
	        }
	        
	        return answer;
	    }
	}
	
	
	// 2번째 방법
	    public int solution(int n) {
	        int answer = 0;
	            
	        while(n != 0){
	            answer += n%10;
	            n /= 10;
	        }
	        return answer;
	    }
	
	
	
}
