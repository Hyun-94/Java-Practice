import java.util.Scanner;

public class Practice02_06 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		
		System.out.print("1~99������ ������ �Է��Ͻÿ�>>"); 
		int number=src.nextInt(); // ���� �Է¹ޱ�
		
		// &&�����ڴ� ||������ ���� �켱 ���������� ��ȣ�� ������Ѵ�
		if((number/10==3|| number/10==6|| number/10==9) && (number%10==3|| number%10==6 || number%10==9)) // 10���ڸ��� 1���ڸ��� 3 6 9 �� ���� ���
			System.out.println("�ڼ�¦¦");
		else if(number/10==3|| number/10==6|| number/10==9) // �����ڸ�
			System.out.println("�ڼ�¦");
		else if(number%10==3|| number%10==6 || number%10==9) // ���� �ڸ�
			System.out.println("�ڼ�¦");
		else
			System.out.println("�ش�Ǵ� ���ڰ� �ƴմϴ�");
		
		src.close();

	}

}
