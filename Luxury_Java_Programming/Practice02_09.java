import java.util.Scanner;

public class Practice02_09 {

	public static void main(String[] args) { // �߽ɿ��� �� r,k ������ �Ÿ��� ���������� �۰ų� ������  ���� ���ο� �ִ�.���� r�� ���� �������� �� Math.sqrt(r)�� �̿��ϸ�ȴ�
		Scanner src=new Scanner(System.in);
		
		int x,y; //���� �߽� ��ǥ
		double radius; // ������
		double r,k; // �ٸ� �� x,y�� ��ǥ
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		x=src.nextInt();
		y=src.nextInt();
		radius=src.nextDouble();
		
		System.out.print("�� �Է�>>");
		r=src.nextDouble();
		k=src.nextDouble();
		
		if(Math.sqrt(((x-r)*(x-r))+((y-k)*(y-k)))<=radius) {
			System.out.println("�� ("+r+","+k+")�� �� �ȿ� �ִ�.");
		}
		else {
			System.out.println("�� ("+r+","+k+")�� �� �ȿ� ����.");
		}
		
		
		src.close();
		
		

	}

}
