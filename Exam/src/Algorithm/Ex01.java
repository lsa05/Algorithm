package Algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex01 {

	public static void main(String[] args) {
			try {
					File f = new File("C://etc/data2.txt");				//파일 객체 만들기 
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);	
					
						for(int i=1;;i++) {								//최종치가 없으므로 무한히 1씩 증가하며 반복 ->무한루프
						String inData = br.readLine();
						if(inData==null) break; 						//종료지점
						
						String arr[] = inData.split(" ");				//파일에서 데이터 1줄 읽은 후, " "를 기준으로 조각내어 String배열에 저장 	
							
						int mid = Integer.parseInt(arr[0]);				//중간
						int fin = Integer.parseInt(arr[1]);				//기말
						int rep = Integer.parseInt(arr[2]);				//숙제
						int att = Integer.parseInt(arr[3]);				//출석
						char grade;
						String app;
						
						double avg = ((mid + fin)/2);
						double score = (avg*0.6) + (rep*0.2) + (att*0.2);  
						
						if(score>=90) {
							 grade = 'A';
						}else if(score>=80) {
							 grade = 'B';
						}else if(score>=70) {
							 grade = 'C';
						}else if(score>=60) {
							 grade = 'D';
						}else {
							 grade = 'F';
						}
							
						
						if(grade == 'A' || grade=='B') {  //왜 틀리지??
							 app = "excellent"; 
						}else if(grade =='C'|| grade=='D') {
							 app = "good"; 
						}else {
							 app = "poor"; 
						}
						System.out.printf("%.2f %c %s\n",score, grade,app);
					}

					}catch(Exception e) {
						e.printStackTrace();
				}	
	}

}
