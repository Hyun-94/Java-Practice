import java.util.Scanner;

public class Practice02_04 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int a,b,c ; // �� ���� ���� ���� 
		System.out.print("���� 3�� �Է�>>");
		
		a=src.nextInt();
		b=src.nextInt();
		c=src.nextInt();
		
		
		if(a>b&&c>a || a<b&&a>c) // a�� �߰����� ���
			System.out.println("�߰� ���� "+a); 
		else if(a>b&&b>c || a<b&&b<c) // b�� �߰����� ���
			System.out.println("�߰� ���� "+b); 
		else // c�� �߰����� ���
			System.out.println("�߰� ���� "+c); 
		
		src.close();

	}

}
