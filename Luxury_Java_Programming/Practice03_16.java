package Practice03;
import java.util.Scanner;

public class Practice03_16 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		String [] str= {"����","����","��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�");
		
		while(true) {
		System.out.print("���� ���� ��!>>");
		String me=src.next();
		if(me.equals("�׸�")) {
			System.out.print("������ �����մϴ�...");
			break;
			}
		
		int n=(int)(Math.random()*3); // 0 1 2 �߿��� �����ϰ� ����
		System.out.print("����� = "+me+", ��ǻ�� ="+str[n]+ ", ");
		if(str[n].equals(me))
			System.out.println("�����ϴ�");
		
		if(me.equals("����")&& str[n].equals("��")|| me.equals("����")&&str[n].equals("����") || me.equals("��")&&str[n].equals("����"))
			System.out.println("����ڰ� �̰���ϴ�");
		else if(me.equals("����")&&str[n].equals("����")|| me.equals("����")&&str[n].equals("��") || me.equals("��")&&str[n].equals("����"))
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");

		}
		src.close();
		
	}

}
