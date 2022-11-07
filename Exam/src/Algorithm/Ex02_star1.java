package Algorithm;
// 스터디 1일 - 별 찍기
public class Ex02_star1 {
	public static void main(String[] args) {
		
		//왼쪽으로 쏠린 별
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }       
        System.out.println();

		//오른쪽으로 쏠린 별
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=(6-i); j++) { //공백
					System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {    //별
				System.out.print("*");
			} System.out.println("");
		}			
		System.out.println();
			
		//피라미드형 별
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=(6-i); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(i-1)*2+1; k++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();


	}   

}