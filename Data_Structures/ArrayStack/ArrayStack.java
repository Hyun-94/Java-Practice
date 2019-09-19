package Subject03;
import java.util.EmptyStackException; // underflow �߻� �� ���α׷��� �����ϱ� ���� import��

public class ArrayStack<E> {
	private E s[]; // ������ ���� �迭
	private int top; // ������ top �׸��� �迭 ���� �ε���
	public ArrayStack() {
		s=(E[])new Object[1]; // �ʱ⿡ ũ�Ⱑ 1�� �迭 ����
		top=-1 ;// Stack�� empty�� ��� -1
	}
	
	public int size() {return top+1;} // ���ÿ� �ִ�  �׸��� ���� ����
	public boolean isEmpty() {return (top==-1);} // ������ empty�̸� true ���� 

	public E peek() { // ���� top �׸��� ���븸�� ����
		if(isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	
	public void push(E newItem) { //push ����
		if(size()==s.length) // ���ÿ� �ִ� �׸�� �迭�� ũ�Ⱑ ������
			resize(2*s.length); // ������ 2��  ũ��� Ȯ��
		s[++top]=newItem; // �� �׸��� push
	}
	
	public E pop() { //pop ����
		if(isEmpty()) throw new EmptyStackException();
		E item=s[top]; // ���� ������ �ִ� �迭�� �׸��� item�� ����
		s[top--]=null; // null�� �ʱ�ȭ
		if(size()>0&&size()==s.length/4)
			resize(s.length/2); // ������ 1/2 ũ��� ���
		return item; // �׳� ����
	}
	
	private void resize(int newSize) { // �迭 ũ�� ����
		Object[] t = new Object[newSize];  // newSize ũ���� ���ο� �迭 t ����
		for (int i = 0; i < size(); i++)
			t[i] = s[i];                   // �迭 s�� �迭 t�� ���� 
		s = (E[]) t;                       // �迭 t�� �迭 s�� 
	}	
	public void print() { // ������ �׸���� �Ʒ����� ���� ���
		if (isEmpty()) System.out.print("������ �������.");      
		else for(int i = 0; i < size(); i++)	System.out.print(s[i]+"\t ");
		System.out.println();
	}
}
