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
		System.out.println("���� ������ ū ���� "+"("+x+","+y+")"+radius);
	}
	
	public int getRadius() { // �������� �����ϴ� getRadius()
		return radius;
	}
}

public class Practice04_06 {

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
		int max=0; //���� ���ϱ� ���� ����
		
		
		for(int i=0;i<c.length;i++) { // ������ ��
			if(max<c[i].getRadius())
				max=c[i].getRadius();
			else
				continue;
		}
		
		for(int i=0;i<c.length;i++) {
			if(max==c[i].getRadius())
				c[i].show();
		}
			
		src.close();

	}

}
