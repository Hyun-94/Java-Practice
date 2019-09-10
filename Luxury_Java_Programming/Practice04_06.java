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
		System.out.println("가장 면적이 큰 원은 "+"("+x+","+y+")"+radius);
	}
	
	public int getRadius() { // 반지름을 리턴하는 getRadius()
		return radius;
	}
}

public class Practice04_06 {

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
		int max=0; //값을 비교하기 위한 변수
		
		
		for(int i=0;i<c.length;i++) { // 반지름 비교
			if(max<c[i].getRadius())
				max=c[i].getRadius();
			else
				continue;
		}
		
		for(int i=0;i<c.length;i++) {
			if(max==c[i].getRadius())
				c[i].show();
		}
			
		src.close();

	}

}
