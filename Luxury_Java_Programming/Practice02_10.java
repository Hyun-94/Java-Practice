import java.util.Scanner;

public class Practice02_10 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int x1,y1,radius1; // 첫 번채 원의 중심과 반지름
		int x2,y2,radius2; // 두 번째 원의 중심과 반지름
		
		System.out.print("첫 번째 원의 중심과 반지름 입력>>");
		x1=src.nextInt();
		y1=src.nextInt();
		radius1=src.nextInt();
		
		System.out.print("두 번째 원의 중심과 반지름 입력>>");
		x2=src.nextInt();
		y2=src.nextInt();
		radius2=src.nextInt();
		
		if(Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)))<=radius1+radius2){ 
			System.out.println("두 원은 서로 겹친다");
		}
		else {
			System.out.println("두 원은 겹치지 않는다");
		}
		
		src.close();
		
		
	}

}
