package Practice03;
import java.util.Scanner;

public class Practice03_09 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int [][] array=new int [4][4]; // 4*4 2���� �迭 ����
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				int random=(int)(Math.random()*10+1); // 1~10������ ������ ������ ���� 
				array[i][j]=random; // �迭�� �ֱ�
			}
			
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+ " "); // ���
			}
			System.out.println(); // �����ٷ� �Ѿ��
		}
		
		src.close();
	}

}
