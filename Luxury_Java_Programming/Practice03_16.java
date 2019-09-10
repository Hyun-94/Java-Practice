package Practice03;
import java.util.Scanner;

public class Practice03_16 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		String [] str= {"가위","바위","보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
		
		while(true) {
		System.out.print("가위 바위 보!>>");
		String me=src.next();
		if(me.equals("그만")) {
			System.out.print("게임을 종료합니다...");
			break;
			}
		
		int n=(int)(Math.random()*3); // 0 1 2 중에서 랜덤하게 결정
		System.out.print("사용자 = "+me+", 컴퓨터 ="+str[n]+ ", ");
		if(str[n].equals(me))
			System.out.println("비겼습니다");
		
		if(me.equals("가위")&& str[n].equals("보")|| me.equals("바위")&&str[n].equals("가위") || me.equals("보")&&str[n].equals("바위"))
			System.out.println("사용자가 이겼습니다");
		else if(me.equals("가위")&&str[n].equals("바위")|| me.equals("바위")&&str[n].equals("보") || me.equals("보")&&str[n].equals("가위"))
			System.out.println("컴퓨터가 이겼습니다");

		}
		src.close();
		
	}

}
