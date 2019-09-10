package Practice03;
import java.util.Scanner;

public class Practice03_08 {

	public static void main(String[] args) {
		 Scanner scr=new Scanner(System.in);
	      System.out.print("정수를 몇 개 저장할까요? ");
	      int num = scr.nextInt();
	      int[] arr = new int[num]; //입력받은 정수만큼의 길이를 가진 배열 생성
	      int cnt = 0;
	      
	      while(cnt < num) {
	         int n = (int)(Math.random()*100+1); // 1~100까지 랜덤한 정수 n
	         for(int i = 0; i < cnt; i++) {
	            if(arr[i] == n) { // 이 전 값과 중복되는 값을 가질 경우
	               n = (int)(Math.random()*100+1);
	               i = -1;
	            }
	         }
	         arr[cnt] = n; // 중복되는 값이 없는 n을 배열에 집어넣기
	         if(cnt!=0 && cnt%10 == 9)
	            System.out.println(arr[cnt++]+" ");
	         else
	            System.out.print(arr[cnt++]+" ");
	      }
	      
	      scr.close();

	   }
}
