import java.util.Scanner;

public class Practice02_07 {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.print("점 (x,y)의 좌표를 입력하시오>>");
	
	int x=src.nextInt(); // 점 x의 좌표입력받기
	int y=src.nextInt(); // 점 y의 좌표입력받기
	
	if((x>=100&&x<=200) &&(y>=100&&y<=200)){ // x,y가 100보다 크거나 같고 200보다 작거나 같으면 참
		System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
	}
	else {
		System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
	}
	
	src.close();

	}

}
