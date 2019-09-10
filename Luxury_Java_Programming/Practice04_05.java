package Practice04;
import java.util.Scanner;
class Circle{ // 객체배열만들기
	private double x,y;
	private int radius;
	public Circle(double x,double y, int radius) { // x,y,radius 초기화
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}
public class Practice04_05 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		Circle [] c=new Circle[3]; // 3개의 Circle 배열 선언
		for(int i=0;i<c.length;i++) {
			System.out.print("x,y,radius >>");
			double x=src.nextDouble(); // x 값 읽기
			double y=src.nextDouble(); // y 값 읽기
			int radius=src.nextInt(); // 반지름 읽기
			c[i]=new Circle(x,y,radius); // Circle 객체 생성
		}
		
		for(int i=0;i<c.length;i++) // 모든 Circle 객체 출력
			c[i].show();
			
		src.close();
	}

}
