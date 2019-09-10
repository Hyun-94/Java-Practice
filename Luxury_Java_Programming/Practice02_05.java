import java.util.Scanner;

public class Practice02_05 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int a=src.nextInt();
		int b=src.nextInt();
		int c=src.nextInt();
		
		if(a+b>c) // 삼각형이 되는 조건 
			System.out.println("삼각형이 됩니다");
		else
			System.out.println("삼각형이 안됩니다");
		
		src.close();
	}

}
