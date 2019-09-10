package Practice03;
import java.util.Scanner;

public class Practice03_14 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		String course[]= {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int [] score= {95,88,76,62,55};
		
		
		while(true) {
			System.out.print("과목 이름>>");
			String name=src.next(); // 과목이름입력받기
			int i=0;
			for(i=0;i<5;i++) {
			if(course[i].equals(name)) {
					System.out.println(course[i]+"의 점수는 "+ score[i]);
					break;
				}	
			}
			if(name.equals("그만"))
				break;
			
			if(i==5) // 입력한 내용과 course[]가 같지않을경우
				System.out.println("없는 과목입니다.");

		}
			src.close();
	}
}
