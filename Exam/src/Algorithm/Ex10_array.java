package Algorithm;

public class Ex10_array {

	public static void main(String[] args) {
		int[][]arr = new int[5][5];
		int cnt=1;
		
		
		
		// 행 단위로 증가하는 배열
		for(int r=0; r<arr.length; r++) {		//행
			for(int c=0; c<arr.length; c++) {	//열
				arr[r][c]=cnt++;
				
				System.out.print(arr[r][c]+" ");
			}System.out.println();
		}
		
		
		
		
		// 열 단위로 증가하는 배열
		System.out.println("\n\n--------------------------------\n\n");
		 
		for(int c=0; c<arr.length; c++) {		//열 
			for(int r=0; r<arr.length; r++) {	//행 
				
				System.out.print(arr[r][c]+" ");
			}System.out.println();
		}
		
		System.out.println("\n\n--------------------------------\n\n");
		
		
		
		
		// 지그재그 배열
		for(int r=0; r<arr.length; r++) {
			if(r%2==0) {
				for(int c=0; c<arr.length; c++) {	//행이 왼쪽->오른쪽, 0번지에서 4번지까지 1번지씩 증가
					System.out.print(arr[r][c]+" ");
				}
			}else {		//배열의 길이는 5지만 index는 4번지까지있어서 -1해줘야함
				for(int c=arr.length-1;c>=0;c--) {	//행이 오른쪽 ->왼쪽, 4번지에서 0번지까지 1번지씩 감소
					System.out.print(arr[r][c]+" ");
				}
			}System.out.println();
		}
		
		
		System.out.println("\n\n--------------------------------\n\n");
		

		
	}

}
