import java.util.Scanner;

public class Practice02_07 {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
	
	int x=src.nextInt(); // �� x�� ��ǥ�Է¹ޱ�
	int y=src.nextInt(); // �� y�� ��ǥ�Է¹ޱ�
	
	if((x>=100&&x<=200) &&(y>=100&&y<=200)){ // x,y�� 100���� ũ�ų� ���� 200���� �۰ų� ������ ��
		System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
	}
	else {
		System.out.println("("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
	}
	
	src.close();

	}

}
