package Algorithm;
//하샤드 수 판별하기
import java.util.Scanner;

public class Ex13_Study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		 boolean answer = true;
	     
		 //자릿수 합 sum 구하기
	     int sum=0;
	     
	     while(x!=0) {  
	     	sum+=x%10;
	     	x/=10;
	     }  
	     
	     //하샤드 수 판별하기
	     if(x%sum==0) {
	     	answer = true; //return answer;
	     	
	     }else {
	     	answer = false;
	     }
		 System.out.println(answer);
	}
} 
//     x % sum==0 ? true :false;   
	 
	
	//프로그래머스 - 삼항연산자
//	 class Solution {
//		    public boolean solution(int x) {
//		        int num=x;
//	            int sum=0;
//		        boolean answer;
//	            
//		        while(num!=0) {
//		        	sum+=num%10;
//		        	num/=10;
//		        }
//		        
//		        return x % sum==0?true:false;
//		    }
//	}
	 
	 
	 
	 
	 
	 //프로그래머스 - if문
//	 class Solution {
//		    public boolean solution(int x) {
//		        int num=x;
//	            int sum=0;
//		        boolean answer=true;
//	            
//				//자릿수 합 구하기
//		        while(num!=0) {
//		        	sum+=num%10;
//		        	num/=10;
//		        }
//		        
//				//하샤드 판별하기
//		        if(x%sum==0) {
//		        	answer = true;
//		        }else {
//		        	answer = false;
//		        }
//		        return answer;
//		    }
//	}
//	 
	 


//class Solution {
//    public boolean solution(int x) {
//        boolean answer = true;
//        int sum=0;
//        
//        String tmp=""+x;
//        String[] str=tmp.split("");
//        for(String s: str){
//            sum+=Integer.parseInt(s);
//        }
//        
//        if(x%sum!=0) answer=false; 
//        
//        return answer;
//    }
//}
