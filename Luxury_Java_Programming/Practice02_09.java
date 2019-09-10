import java.util.Scanner;

public class Practice02_09 {

	public static void main(String[] args) { // 중심에서 점 r,k 사이의 거리가 반지름보다 작거나 같으면  원의 내부에 있다.변수 r에 대한 제곱근의 값 Math.sqrt(r)를 이용하면된다
		Scanner src=new Scanner(System.in);
		
		int x,y; //원의 중심 좌표
		double radius; // 반지름
		double r,k; // 다른 점 x,y의 좌표
		
		System.out.print("원의 중심과 반지름 입력>>");
		x=src.nextInt();
		y=src.nextInt();
		radius=src.nextDouble();
		
		System.out.print("점 입력>>");
		r=src.nextDouble();
		k=src.nextDouble();
		
		if(Math.sqrt(((x-r)*(x-r))+((y-k)*(y-k)))<=radius) {
			System.out.println("점 ("+r+","+k+")는 원 안에 있다.");
		}
		else {
			System.out.println("점 ("+r+","+k+")는 원 안에 없다.");
		}
		
		
		src.close();
		
		

	}

}
