package Practice03;
import java.util.Scanner;

public class Practice03_08 {

	public static void main(String[] args) {
		 Scanner scr=new Scanner(System.in);
	      System.out.print("������ �� �� �����ұ��? ");
	      int num = scr.nextInt();
	      int[] arr = new int[num]; //�Է¹��� ������ŭ�� ���̸� ���� �迭 ����
	      int cnt = 0;
	      
	      while(cnt < num) {
	         int n = (int)(Math.random()*100+1); // 1~100���� ������ ���� n
	         for(int i = 0; i < cnt; i++) {
	            if(arr[i] == n) { // �� �� ���� �ߺ��Ǵ� ���� ���� ���
	               n = (int)(Math.random()*100+1);
	               i = -1;
	            }
	         }
	         arr[cnt] = n; // �ߺ��Ǵ� ���� ���� n�� �迭�� ����ֱ�
	         if(cnt!=0 && cnt%10 == 9)
	            System.out.println(arr[cnt++]+" ");
	         else
	            System.out.print(arr[cnt++]+" ");
	      }
	      
	      scr.close();

	   }
}
