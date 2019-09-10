import java.util.Scanner;

public class Practice02_06 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		
		System.out.print("1~99사이의 정수를 입력하시오>>"); 
		int number=src.nextInt(); // 정수 입력받기
		
		// &&연산자는 ||연산자 보다 우선 순위임으로 괄호를 해줘야한다
		if((number/10==3|| number/10==6|| number/10==9) && (number%10==3|| number%10==6 || number%10==9)) // 10의자리와 1의자리가 3 6 9 가 들어가는 경우
			System.out.println("박수짝짝");
		else if(number/10==3|| number/10==6|| number/10==9) // 십의자리
			System.out.println("박수짝");
		else if(number%10==3|| number%10==6 || number%10==9) // 일의 자리
			System.out.println("박수짝");
		else
			System.out.println("해당되는 숫자가 아닙니다");
		
		src.close();

	}

}
