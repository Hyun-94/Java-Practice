package Practice03;
import java.util.Scanner;

public class Practice03_10 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int [][] array=new int [4][4]; // 2���� 4*4 �迭
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=0; // �迭�� �� ��� 0���� �ʱ�ȭ
			}
		}
		int num=0;
		while(num<10) {
			int col=(int)(Math.random()*4); // 0<=col<4
			int row=(int)(Math.random()*4); // 0<=row<4
			array[col][row]=(int)(Math.random()*10+1);// 1~10
			if(array[col][row]==0) {
				array[col][row]=(int)(Math.random()*10+1); // ���� 0�̸� �ٽùޱ�
				num++;
			}
			else
				num++;
			
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		src.close();
	}

}
