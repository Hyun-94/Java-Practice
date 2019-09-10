import java.util.Scanner;

public class Practice02_03 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int a,b,c,d,e,f,g ; // 각각 돈의 액수
		
		System.out.print("금액을 입력하시오>>");
		int money=src.nextInt(); // 금액 입력받기
		
		a=money/50000;
		money=money-(a*50000); //50000원 계산
		
		b=money/10000;
		money=money-(b*10000); //10000원 계산
		
		c =money / 1000;
	    money = money - (c * 1000); //1000원 계산
	      
	    d =money / 100;
	    money = money - (d * 100); //100원 계산
	      
	    e =money / 50;
	    money = money - (e * 50); //50원 계산
	      
	    f =money / 10;
	    money = money - (f * 10); //10원 계산
	      
	    g =money; // 1원 계산
	      
	      System.out.println("오만원권 "+a+"개");
	      System.out.println("만원권 "+b+"개");
	      System.out.println("천원권 "+c+"개");
	      System.out.println("백원 "+d+"개");
	      System.out.println("오십원 "+e+"개");
	      System.out.println("십원 "+f+"개");
	      System.out.println("일원 "+g+"개");
		
		  src.close();
	}
}
