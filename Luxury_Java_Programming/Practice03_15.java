package Practice03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice03_15 {
		public static void main(String[] args) {
			Scanner src = new Scanner(System.in);
			do {
				System.out.print("곱하고자 하는 두 수 입력>>");
				try {
					int n = src.nextInt();
					int m = src.nextInt();
					System.out.print(n + "x" + m + "=" + n*m);
					break;
				} catch(InputMismatchException e) {
					System.out.println("실수는 입력하면 안됩니다.");
					src.next(); // Enter키까지 읽어서 버린다.
					continue;
				}
			} while(true);

			src.close();
		}
}
