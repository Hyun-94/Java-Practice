package Practice04;
import java.util.Scanner;
class Circle{ // ��ü�迭�����
	private double x,y;
	private int radius;
	public Circle(double x,double y, int radius) { // x,y,radius �ʱ�ȭ
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}
public class Practice04_05 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		Circle [] c=new Circle[3]; // 3���� Circle �迭 ����
		for(int i=0;i<c.length;i++) {
			System.out.print("x,y,radius >>");
			double x=src.nextDouble(); // x �� �б�
			double y=src.nextDouble(); // y �� �б�
			int radius=src.nextInt(); // ������ �б�
			c[i]=new Circle(x,y,radius); // Circle ��ü ����
		}
		
		for(int i=0;i<c.length;i++) // ��� Circle ��ü ���
			c[i].show();
			
		src.close();
	}

}
