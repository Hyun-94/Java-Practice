
public class Practice03_02 {

	public static void main(String[] args) {
		int n [][]= {{1}, {1,2,3}, {1},{1,2,3,4},{1,2}}; // �������� 2���� �迭 �ʱ�ȭ
		
		for(int i=0;i<n.length;i++) { // �࿡ ���� �ݺ�
			for(int j=0;j<n[i].length;j++) { // ���� ���� �ݺ�
				System.out.print(" "+n[i][j]);
				
			}
			System.out.println(); // �ϳ��� �࿡ ����� ��� ������� �� �ٳѱ�
		}

	}

}
