import java.util.Scanner;

public class Practice03_06 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int [] storeMoney=new int [8];
		int [] unit= {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 배열 생성 및 초기화
		System.out.print("금액을 입력하시오>>");
		int money=src.nextInt();
		
		
		for(int i=0; i<unit.length;i++) {
			storeMoney[i]=money/unit[i];
			money=money-(unit[i]*storeMoney[i]);
		}
		
		for(int i=0;i<unit.length;i++) {
			if(storeMoney[i]==0) {
				continue;
			}
			System.out.println(unit[i]+"원 짜리 : "+storeMoney[i]+"개");
		}
		src.close();
	}

}
