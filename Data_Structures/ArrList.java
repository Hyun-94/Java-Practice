package Subject01;
import java.util.NoSuchElementException; // 리스트가 empty인 상황에서 항목을 읽으려고 하면 프로그램을 정지시키는 예외 처리를 하는 클래스

public class ArrList<E> {
	private E a[]; // 리스트의 항목들을 저장할 배열
	private int size; // 리스트의 항목 수
	
	public ArrList() { // 생성자
		a=(E[])new Object[1]; // 최초로 1개의 원소를 가진 배열 생성
		size=0; // 항목의 수를 0으로 초기화
	}
	// 탐색
	public E peek(int k) {// k번째 항목을 리턴, 단순히 읽기만 한다.
		if(size==0)
			throw new NoSuchElementException(); // underflow 경우에 프로그램 정지
		return a[k]; // k<size 라고 가정
	}
	
	public void insertLast(E newItem) { // 가장 뒤에 새 항목 삽입
		if(size==a.length) // 배열의 빈 공간이 없으면
			resize(2*a.length); // 배열 크기 2배로 확장
		a[size++]=newItem; // 새 항목 삽입
	}
	
	public void insert(E newItem,int k) {// 새 항목을 k-1번째 항목 다음에 삽입
		if(size==a.length) // 배열에 빈 공간이 없으면
			resize(2*a.length); // 배열 크기 2배로 확장
		for(int i=size-1;i>=k;i--) // 한 칸씩 뒤로 이동
			a[i+1]=a[i];
		a[k]=newItem;
		size++;
		
	}
	
	public void insert(E newItem) { // 항목 삽입
		if(size==a.length) // 배열에 빈 공간이 없으면
			resize(2*a.length);
		a[size++]=newItem;
	}
	
	public void resize(int newSize) { // 배열의 크기 조절
		Object [] t=new Object[newSize]; // newSize 크기의 새로운 배열 t생성
		for(int i=0;i<size;i++)
			t[i]=a[i]; // 배열 a를 t로 복사
		a=(E[])t; // 배열 a가 t를 참조 , a는 가비지 컬랙션에 의해 처리
	}
	
	public E delete(int k) { // K번째 항목 삭제
		//isEmpty()만 쓰면 어떤 문자열이 비워져 있는지 알 수 없다 a[k]자체는 arrList배열
		if(((String)a[k]).isEmpty()) throw new NoSuchElementException();// underFlow 경우에 프로그램 정지
		E item=a[k]; 
		for(int i=k;i<size;i++)
			a[i]=a[i+1]; // 한 칸씩 앞으로 이동
		size--;
		if(size>0 && size==a.length/4) // 배열에 항목들이 1/4만 차지한다면
			resize(a.length/2); // 배열을 1/2크기로 축소
		return item;
	}
	
	
	public void print() {
		for(int i=0;i<a.length;i++) { // 배열의 길이만큼 반복
			if(a[i]!=null)
				System.out.print(a[i]+"\t");
			else
				System.out.print("null"+"\t");
		}
		System.out.println();
	}
	
	
	

}
