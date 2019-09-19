package Subject04;
import java.util.EmptyStackException;

public class ListStack<E> {
	private Node<E> top; // ���� top �׸��� ���� Node�� ����Ű������
	private int size; // ������ �׸��
	public ListStack() {
		top=null;
		size=0;
	}
	
	public int size() {return size;} // ������ �׸��� ���� ����
	public boolean isEmpty() {return size==0;} // ������ empty�̸� true ����
	
	public E peek() { // ���� top �׸��� ����
		if(isEmpty()) throw new EmptyStackException();
		return top.getItem();
	}
	
	public void push(E newItem) { // ���� push ����
		Node newNode=new Node(newItem,top); // top�� ����Ű�� �ִ� ���۷����� newNode�� ..
		top=newNode; // top�� newNode�� ����Ŵ.
		size++;
	}
	
	public E pop() { // ���� pop ����
		if(isEmpty()) throw new EmptyStackException(); // underflow �� ���α׷� ����
		E topItem=top.getItem(); // ���� top �׸��� topItem�� ����
		top=top.getNext(); // top�� �����ϴ� ����� ���� ��带 ����Ű�� ��
		size--;
		return topItem;
	}
	public void print() { // ������ �׸���� top���� ���ʷ� ���
		if (isEmpty()) System.out.print("������ �������.");      
		else 
			for (Node p = top; p != null; p = p.getNext()) // top�� �����ϴ� ����� ���� ��带 ����Ű�� ��
				System.out.print(p.getItem()+"\t ");
		System.out.println();
	}

}
