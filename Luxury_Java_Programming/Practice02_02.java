import java.util.Scanner;

public class Practice02_02 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int number =src.nextInt(); // 정수입력받기
		if(number/10==number%10) // 10의 자리와 1의 자리가 같으면 
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다"); //True
		else
			System.out.println("no! 10의 자리와 1의 자리가 같지않습니다"); // False
		
		src.close();

	}

}
