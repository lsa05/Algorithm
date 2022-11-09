package Algorithm;
//자릿수 합 구하기
public class Ex09_Study {

	public class Solution {
	    public int solution(int n) {											    		//162
	    	String str=String.valueOf(n);			//문자열로 변환해서(String.valueOf) 변수str에 저장  
	    	String[]arr=str.split("");				//""단위로 쪼개서(숫자 하나씩 쪼개짐) 배열에 저장	//[1,6,2]
	        int answer = 0;
	        
	        for(int i=0;i<arr.length;i++) {			//0번지~2번지까지 
	        	answer+=Integer.parseInt(arr[i]);	//배열의 구성요소를 정수로 바꿔서 합 연산			//1+6+2
	        } 
	        return answer;
	    }
	}
	
	
	// 2번째 방법
//	    public int solution(int n) {
//	        int answer = 0;
//	            
//	        while(n != 0){				//n= 	162				16		1
//	        	answer += n%10;			//		+2				+6		+1    =>1+6+2
//	            n /= 10;				//16.2->16=n        1.6->1		0   //n을 10으로 나눈 몫을 n에 저장함
//	        }
//	        return answer;
//	    }
//	
	
	
	
	//3번째 방법 (아스키코드)
//	    public int solution(int n) {
//
//	        int answer = 0;
//	        String a= Integer.toString(n);
//	        char[] b = a.toCharArray();
//
//	        for( int i=0;i<b.length;i++){
//	            answer+=(b[i]-48);
//	        }
//	        return answer;
//	    }
	
}
