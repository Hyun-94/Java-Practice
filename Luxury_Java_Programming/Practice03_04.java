import java.util.Scanner;

public class Practice03_04 {

	public static void main(String[] args) { // a�� �ƽ�Ű�ڵ� 97 ~ z �ƽ�Ű�ڵ� 122
		Scanner src=new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>"); // ���ڸ� ���ڷ� ��ȯ�ϰ� ���ڸ� ���ڷ� ��ȯ�ϱ�
		String s=src.next(); // ���ڿ� �б�
		char c=s.charAt(0); // Scanner�� ���ڸ� �Է¹޴±���� �������� ���ڿ��� �Է¹ް� ���ڿ��� ù��° ���ڸ� �̴´�.
		char copyC=c;
		
		for(int i=97;i<=c;i++) { // ���� �ݺ�
			for(int j=97;j<=copyC;j++) { //���� �ݺ� 
				System.out.print((char)j);
			}
			System.out.println();
			copyC--; 
			
		}
		
		src.close();

	}

}
