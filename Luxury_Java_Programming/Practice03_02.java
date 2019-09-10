
public class Practice03_02 {

	public static void main(String[] args) {
		int n [][]= {{1}, {1,2,3}, {1},{1,2,3,4},{1,2}}; // 비정방형 2차원 배열 초기화
		
		for(int i=0;i<n.length;i++) { // 행에 대한 반복
			for(int j=0;j<n[i].length;j++) { // 열에 대한 반복
				System.out.print(" "+n[i][j]);
				
			}
			System.out.println(); // 하나의 행에 결과를 모두 출력했을 때 줄넘김
		}

	}

}
