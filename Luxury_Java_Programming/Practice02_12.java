import java.util.Scanner;

public class Practice02_12 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("연산>>");
		int a=src.nextInt();
		String s=src.next();
		int b=src.nextInt();
		
		if(s.equals("+"))
			System.out.println(a+s+b+"의 계산 결과는 "+(a+b));
		else if(s.equals("-"))
			System.out.println(a+s+b+"의 계산 결과는 "+(a-b));
		else if(s.equals("*"))
			System.out.println(a+s+b+"의 계산 결과는 "+(a*b));
		else if(s.equals("/")) {
			if(b==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.println(a+s+b+"의 계산 결과는 "+(a/b));
		}
		else
			System.out.println("연산자가 아닙니다");
		
		src.close();
	}

}
