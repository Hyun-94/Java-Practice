import java.util.Scanner;

public class Practice02_12 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.print("����>>");
		int a=src.nextInt();
		String s=src.next();
		int b=src.nextInt();
		
		if(s.equals("+"))
			System.out.println(a+s+b+"�� ��� ����� "+(a+b));
		else if(s.equals("-"))
			System.out.println(a+s+b+"�� ��� ����� "+(a-b));
		else if(s.equals("*"))
			System.out.println(a+s+b+"�� ��� ����� "+(a*b));
		else if(s.equals("/")) {
			if(b==0)
				System.out.println("0���� ���� �� �����ϴ�");
			else
				System.out.println(a+s+b+"�� ��� ����� "+(a/b));
		}
		else
			System.out.println("�����ڰ� �ƴմϴ�");
		
		src.close();
	}

}
