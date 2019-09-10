import java.util.Scanner;

public class Practice02_04 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int a,b,c ; // 세 개의 정수 변수 
		System.out.print("정수 3개 입력>>");
		
		a=src.nextInt();
		b=src.nextInt();
		c=src.nextInt();
		
		
		if(a>b&&c>a || a<b&&a>c) // a가 중간값인 경우
			System.out.println("중간 값은 "+a); 
		else if(a>b&&b>c || a<b&&b<c) // b가 중간값인 경우
			System.out.println("중간 값은 "+b); 
		else // c가 중간값인 경우
			System.out.println("중간 값은 "+c); 
		
		src.close();

	}

}
