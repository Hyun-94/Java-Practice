import java.util.Scanner;

public class Practice02_02 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int number =src.nextInt(); // �����Է¹ޱ�
		if(number/10==number%10) // 10�� �ڸ��� 1�� �ڸ��� ������ 
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�"); //True
		else
			System.out.println("no! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�"); // False
		
		src.close();

	}

}
