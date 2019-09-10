import java.util.Scanner;

public class Practice03_05 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		int[] num=new int [10]; // 배열의 길이가 10인 num 배열 
		
		for(int i=0;i<num.length;i++) {
			num[i]=src.nextInt(); // 10개의 정수 입력받기
		}
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%3==0) { // num이 3의 배수일 경우
				System.out.print("3의 배수는 "+num[i]+" "); // 3의 배수 출력
			}
		}
		src.close();
	}

}
