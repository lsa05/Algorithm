package Algorithm;
// 배열 뒤집기
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex11_array2 {

	public static void main(String[] args) {
		Integer[][]arr = new Integer[5][5];
		int cnt=1;
		

		// 행 단위로 증가하는 배열
		for(int r=0; r<arr.length; r++) {		//행
			for(int c=0; c<arr.length; c++) {	//열
				arr[r][c]=cnt++;
				
				System.out.print(arr[r][c]+" ");
			}System.out.println();
		}
		
		System.out.println("\n\n--------------------------------\n\n");
		
		// 뒤집기
		for(Integer row[] : arr) {						//2차원 배열 arr의 1줄의 정보를 1차원 배열로 row에 대입->반복
			List<Integer> list = Arrays.asList(row);
			Collections.reverse(list);
			Integer result[]=list.toArray(new Integer[0]);
			
			for(int i=0;i<result.length; i++) {
				System.out.print(result[i]+" ");
			}System.out.println();
		}
			
		
	}
}
