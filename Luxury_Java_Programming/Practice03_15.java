package Practice03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice03_15 {
		public static void main(String[] args) {
			Scanner src = new Scanner(System.in);
			do {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				try {
					int n = src.nextInt();
					int m = src.nextInt();
					System.out.print(n + "x" + m + "=" + n*m);
					break;
				} catch(InputMismatchException e) {
					System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
					src.next(); // EnterŰ���� �о ������.
					continue;
				}
			} while(true);

			src.close();
		}
}
