import java.util.Scanner;

public class Practice02_08 {
	
	public static boolean inRect(int x,int y,int rectx1, int recty1, int rectx2, int recty2) { // �� x,y�� �� �簢�� �ȿ� ������ true�� ����
		if((x>=rectx1 &&x <=rectx2) && (y>=recty1 && y<=recty2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) { // �Ѵ� �� ���ȿ� ������ true
		Scanner src=new Scanner(System.in);
		int x1,x2,y1,y2; 
		
		System.out.print("x1,y1 ��ǥ�� �Է��ϼ���>>");
		x1=src.nextInt(); 
		y1=src.nextInt();
		System.out.print("x2,y2 ��ǥ�� �Է��ϼ���>>");
		x2=src.nextInt();
		y2=src.nextInt();
		
		if(inRect(x1,y1,100,100,200,200)==true) 
			System.out.println("���簢���� �浹 �մϴ�");
		
		else if(inRect(x2,y2,100,100,200,200)==true)
			System.out.println("���簢���� �浹 �մϴ�");
		else {
			System.out.println("���簢�� �� �浹���� �ʽ��ϴ�");
		}
		
		src.close();
		
		
	}

}
