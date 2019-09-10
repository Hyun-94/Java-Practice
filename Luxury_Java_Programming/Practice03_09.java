package Practice03;
import java.util.Scanner;

public class Practice03_09 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int [][] array=new int [4][4]; // 4*4 2차원 배열 생성
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				int random=(int)(Math.random()*10+1); // 1~10까지의 범위의 랜덤한 정수 
				array[i][j]=random; // 배열에 넣기
			}
			
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+ " "); // 출력
			}
			System.out.println(); // 다음줄로 넘어가기
		}
		
		src.close();
	}

}
