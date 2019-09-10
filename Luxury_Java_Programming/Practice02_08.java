import java.util.Scanner;

public class Practice02_08 {
	
	public static boolean inRect(int x,int y,int rectx1, int recty1, int rectx2, int recty2) { // 점 x,y가 두 사각형 안에 있으면 true를 리턴
		if((x>=rectx1 &&x <=rectx2) && (y>=recty1 && y<=recty2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) { // 둘다 두 점안에 있으면 true
		Scanner src=new Scanner(System.in);
		int x1,x2,y1,y2; 
		
		System.out.print("x1,y1 좌표를 입력하세요>>");
		x1=src.nextInt(); 
		y1=src.nextInt();
		System.out.print("x2,y2 좌표를 입력하세요>>");
		x2=src.nextInt();
		y2=src.nextInt();
		
		if(inRect(x1,y1,100,100,200,200)==true) 
			System.out.println("직사각형과 충돌 합니다");
		
		else if(inRect(x2,y2,100,100,200,200)==true)
			System.out.println("직사각형과 충돌 합니다");
		else {
			System.out.println("직사각형 과 충돌하지 않습니다");
		}
		
		src.close();
		
		
	}

}
