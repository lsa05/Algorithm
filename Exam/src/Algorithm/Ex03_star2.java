package Algorithm;

public class Ex03_star2 {

	public static void main(String[] args) {
		//다이아몬드형 별(틀림)
				//상단
				for(int i=1; i<=6; i++) {
					for(int j=1; j<=(6-i); j++) { //공백
						System.out.print(" ");
					}
					for(int k=1; k<=(i-1)*2+1; k++) {
						System.out.print("*");
					}System.out.println();
				}
				//하단 - 막힘
				for(int i=1;i<6;i++) {
					for(int j=1; j<=i; j++) { //공백
						System.out.print(" ");
					}
				for(int k=1; k<=2*(i-1)-1; k++) {
						System.out.print("*");
					}System.out.println();

	}

}}
