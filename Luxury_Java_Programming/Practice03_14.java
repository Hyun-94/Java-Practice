package Practice03;
import java.util.Scanner;

public class Practice03_14 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		String course[]= {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int [] score= {95,88,76,62,55};
		
		
		while(true) {
			System.out.print("���� �̸�>>");
			String name=src.next(); // �����̸��Է¹ޱ�
			int i=0;
			for(i=0;i<5;i++) {
			if(course[i].equals(name)) {
					System.out.println(course[i]+"�� ������ "+ score[i]);
					break;
				}	
			}
			if(name.equals("�׸�"))
				break;
			
			if(i==5) // �Է��� ����� course[]�� �����������
				System.out.println("���� �����Դϴ�.");

		}
			src.close();
	}
}
