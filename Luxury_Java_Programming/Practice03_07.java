public class Practice03_07 {

	public static void main(String[] args) {
		
		int [] array=new int [10]; // 10 인 배열 생성
		System.out.print("랜덤한 정수들 : ");
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			int random=(int)(Math.random()*10+1); // 1~10까지 범위의 정수를 랜덩하게 생성
			array[i]=random; // 배열에 저장
			System.out.print(random+" "); // 출력
			sum+=array[i]; // sum에 배열의 합 저장
		}
		System.out.println();
		System.out.print("평균은 "+sum/10); // 평균 출력
		
		

	}

}
