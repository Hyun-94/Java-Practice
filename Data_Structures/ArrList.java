package Subject01;
import java.util.NoSuchElementException; // ����Ʈ�� empty�� ��Ȳ���� �׸��� �������� �ϸ� ���α׷��� ������Ű�� ���� ó���� �ϴ� Ŭ����

public class ArrList<E> {
	private E a[]; // ����Ʈ�� �׸���� ������ �迭
	private int size; // ����Ʈ�� �׸� ��
	
	public ArrList() { // ������
		a=(E[])new Object[1]; // ���ʷ� 1���� ���Ҹ� ���� �迭 ����
		size=0; // �׸��� ���� 0���� �ʱ�ȭ
	}
	// Ž��
	public E peek(int k) {// k��° �׸��� ����, �ܼ��� �б⸸ �Ѵ�.
		if(size==0)
			throw new NoSuchElementException(); // underflow ��쿡 ���α׷� ����
		return a[k]; // k<size ��� ����
	}
	
	public void insertLast(E newItem) { // ���� �ڿ� �� �׸� ����
		if(size==a.length) // �迭�� �� ������ ������
			resize(2*a.length); // �迭 ũ�� 2��� Ȯ��
		a[size++]=newItem; // �� �׸� ����
	}
	
	public void insert(E newItem,int k) {// �� �׸��� k-1��° �׸� ������ ����
		if(size==a.length) // �迭�� �� ������ ������
			resize(2*a.length); // �迭 ũ�� 2��� Ȯ��
		for(int i=size-1;i>=k;i--) // �� ĭ�� �ڷ� �̵�
			a[i+1]=a[i];
		a[k]=newItem;
		size++;
		
	}
	
	public void insert(E newItem) { // �׸� ����
		if(size==a.length) // �迭�� �� ������ ������
			resize(2*a.length);
		a[size++]=newItem;
	}
	
	public void resize(int newSize) { // �迭�� ũ�� ����
		Object [] t=new Object[newSize]; // newSize ũ���� ���ο� �迭 t����
		for(int i=0;i<size;i++)
			t[i]=a[i]; // �迭 a�� t�� ����
		a=(E[])t; // �迭 a�� t�� ���� , a�� ������ �÷��ǿ� ���� ó��
	}
	
	public E delete(int k) { // K��° �׸� ����
		//isEmpty()�� ���� � ���ڿ��� ����� �ִ��� �� �� ���� a[k]��ü�� arrList�迭
		if(((String)a[k]).isEmpty()) throw new NoSuchElementException();// underFlow ��쿡 ���α׷� ����
		E item=a[k]; 
		for(int i=k;i<size;i++)
			a[i]=a[i+1]; // �� ĭ�� ������ �̵�
		size--;
		if(size>0 && size==a.length/4) // �迭�� �׸���� 1/4�� �����Ѵٸ�
			resize(a.length/2); // �迭�� 1/2ũ��� ���
		return item;
	}
	
	
	public void print() {
		for(int i=0;i<a.length;i++) { // �迭�� ���̸�ŭ �ݺ�
			if(a[i]!=null)
				System.out.print(a[i]+"\t");
			else
				System.out.print("null"+"\t");
		}
		System.out.println();
	}
	
	
	

}
