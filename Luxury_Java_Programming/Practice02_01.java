import java.util.Scanner;

public class Practice02_01 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won=src.nextInt(); // 원화를 입력받음
		double foreign_currency=won/1000; //원화를 외화로 바꿔줌
		
		System.out.println(won+"원은 $"+foreign_currency+"입니다.");
		
		src.close();
		

	}

}
