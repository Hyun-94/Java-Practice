import java.util.Scanner;

public class Practice02_01 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won=src.nextInt(); // ��ȭ�� �Է¹���
		double foreign_currency=won/1000; //��ȭ�� ��ȭ�� �ٲ���
		
		System.out.println(won+"���� $"+foreign_currency+"�Դϴ�.");
		
		src.close();
		

	}

}
