import java.util.Scanner;

public class Practice03_05 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		int[] num=new int [10]; // �迭�� ���̰� 10�� num �迭 
		
		for(int i=0;i<num.length;i++) {
			num[i]=src.nextInt(); // 10���� ���� �Է¹ޱ�
		}
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%3==0) { // num�� 3�� ����� ���
				System.out.print("3�� ����� "+num[i]+" "); // 3�� ��� ���
			}
		}
		src.close();
	}

}
