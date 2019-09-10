import java.util.Scanner;

public class Practice03_03 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int num=src.nextInt(); // 정수 입력 받기
		int cpyNum=num; // num값과 cpyNum값이 같게 만들기
		
		for(int i=0;i<num;i++) { //행의 반복
			for(int j=0;j<cpyNum;j++) { // 열의 반복
				System.out.print("*");
				
			}
			System.out.println();
			cpyNum--;
		}
		
		src.close();

	}

}
