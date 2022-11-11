package Algorithm;
// p y 개수구하기 
/*대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 * */
import java.util.Scanner;

public class Ex14_Study {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //입력받을 문자열
        
        int cp=0; 	//p의 개수 초기화
        int cy=0;	//y의 개수
        
        
        for(int i=0; i<s.length(); i++) {
        	if('p'==s.charAt(i) || 'P'==s.charAt(i)) {
        		cp++;	
        	}else if('Y'==s.charAt(i) || 'y'==s.charAt(i)) {
        		cy++;					        
        	}	
        }
        
        if(cp==cy) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }	
        
	}

}
	//다른 사람 풀이
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        int p_cnt=0;
//        int y_cnt=0;
//
//        String[] str=s.split("");
//        for(String ss: str){
//            if(ss.equalsIgnoreCase("p")) p_cnt++;
//            else if(ss.equalsIgnoreCase("y")) y_cnt++;
//        }
//
//        if(p_cnt!=y_cnt) answer=false;
//        
//        return answer;
//    }
//}









//람다식
//class Solution {
//    boolean solution(String s) {
//        s = s.toUpperCase();
//
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
//    }
//}