public class Practice03_07 {

	public static void main(String[] args) {
		
		int [] array=new int [10]; // 10 �� �迭 ����
		System.out.print("������ ������ : ");
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			int random=(int)(Math.random()*10+1); // 1~10���� ������ ������ �����ϰ� ����
			array[i]=random; // �迭�� ����
			System.out.print(random+" "); // ���
			sum+=array[i]; // sum�� �迭�� �� ����
		}
		System.out.println();
		System.out.print("����� "+sum/10); // ��� ���
		
		

	}

}
