package Practice04;
import java.util.Scanner;
class Grade{
	private int math;
	private int science;
	private int english;
	
	public Grade(int math,int science,int english) {
		this.math=math;
		this.science=science;
		this.english=english;
		
	}
	public int average() {
		return (math+science+english)/3;
	}
}

public class Practice04_02 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math=src.nextInt();
		int science=src.nextInt();
		int english=src.nextInt();
		Grade me=new Grade(math,science,english);
		System.out.println("����� "+ me.average()); //average()�� ����� ����Ͽ� ����
		
		src.close();
		

	}

}
