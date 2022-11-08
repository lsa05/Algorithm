package Algorithm;
//짝수 홀수
public class Ex04_EvenOrOdd {

	 public String solution(int num) {
	        String answer = "";
	       
	    //나의 풀이 - if문
	         if(num%2==0){
	            answer="Even";            
	        }else{
	            answer="Odd";
	        }
	        
	        return answer;

	        
	    //삼항연산자 이용
	    //return num % 2 == 0 ? "Even" : "Odd";
	        
	    
	    
	}
}
