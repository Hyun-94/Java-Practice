import java.util.Scanner;

public class Practice03_03 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		int num=src.nextInt(); // ���� �Է� �ޱ�
		int cpyNum=num; // num���� cpyNum���� ���� �����
		
		for(int i=0;i<num;i++) { //���� �ݺ�
			for(int j=0;j<cpyNum;j++) { // ���� �ݺ�
				System.out.print("*");
				
			}
			System.out.println();
			cpyNum--;
		}
		
		src.close();

	}

}
