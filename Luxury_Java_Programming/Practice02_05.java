import java.util.Scanner;

public class Practice02_05 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int a=src.nextInt();
		int b=src.nextInt();
		int c=src.nextInt();
		
		if(a+b>c) // �ﰢ���� �Ǵ� ���� 
			System.out.println("�ﰢ���� �˴ϴ�");
		else
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		
		src.close();
	}

}
