import java.util.Scanner;

public class Practice03_04 {

	public static void main(String[] args) { // a의 아스키코드 97 ~ z 아스키코드 122
		Scanner src=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>"); // 문자를 숫자로 변환하고 숫자를 문자로 변환하기
		String s=src.next(); // 문자열 읽기
		char c=s.charAt(0); // Scanner는 문자를 입력받는기능이 없음으로 문자열을 입력받고 문자열의 첫번째 문자를 뽑는다.
		char copyC=c;
		
		for(int i=97;i<=c;i++) { // 행의 반복
			for(int j=97;j<=copyC;j++) { //열의 반복 
				System.out.print((char)j);
			}
			System.out.println();
			copyC--; 
			
		}
		
		src.close();

	}

}
