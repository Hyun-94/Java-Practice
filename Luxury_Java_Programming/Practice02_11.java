import java.util.Scanner;

public class Practice02_11 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month=src.nextInt(); // ���� �Է¹��� ���� month
		
		if(month>=3 && month<=5)
			System.out.println("��");
		else if(month>=6 && month<=8)
			System.out.println("����");
		else if(month>=9 && month<=11)
			System.out.println("����");
		else if(month==12 || month==1 ||month==2)
			System.out.println("�ܿ�");
		else
			System.out.println("�߸��Է�");
		
		src.close();

	}

}
