import java.util.Scanner;

public class Practice02_10 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int x1,y1,radius1; // ù ��ä ���� �߽ɰ� ������
		int x2,y2,radius2; // �� ��° ���� �߽ɰ� ������
		
		System.out.print("ù ��° ���� �߽ɰ� ������ �Է�>>");
		x1=src.nextInt();
		y1=src.nextInt();
		radius1=src.nextInt();
		
		System.out.print("�� ��° ���� �߽ɰ� ������ �Է�>>");
		x2=src.nextInt();
		y2=src.nextInt();
		radius2=src.nextInt();
		
		if(Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)))<=radius1+radius2){ 
			System.out.println("�� ���� ���� ��ģ��");
		}
		else {
			System.out.println("�� ���� ��ġ�� �ʴ´�");
		}
		
		src.close();
		
		
	}

}
