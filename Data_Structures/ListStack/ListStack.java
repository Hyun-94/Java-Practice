package Subject04;
import java.util.EmptyStackException;

public class ListStack<E> {
	private Node<E> top; // 스택 top 항목을 가진 Node를 가리키기위해
	private int size; // 스택의 항목수
	public ListStack() {
		top=null;
		size=0;
	}
	
	public int size() {return size;} // 스택의 항목의 수를 리턴
	public boolean isEmpty() {return size==0;} // 스택이 empty이면 true 리턴
	
	public E peek() { // 스택 top 항목만을 리턴
		if(isEmpty()) throw new EmptyStackException();
		return top.getItem();
	}
	
	public void push(E newItem) { // 스택 push 연산
		Node newNode=new Node(newItem,top); // top이 가르키고 있던 레퍼런스를 newNode에 ..
		top=newNode; // top은 newNode를 가르킴.
		size++;
	}
	
	public E pop() { // 스택 pop 연산
		if(isEmpty()) throw new EmptyStackException(); // underflow 시 프로그램 정지
		E topItem=top.getItem(); // 스택 top 항목을 topItem에 저장
		top=top.getNext(); // top이 참조하던 노드의 다음 노드를 가르키게 함
		size--;
		return topItem;
	}
	public void print() { // 스택의 항목들을 top부터 차례로 출력
		if (isEmpty()) System.out.print("스택이 비어있음.");      
		else 
			for (Node p = top; p != null; p = p.getNext()) // top가 참조하던 노드의 다음 노드를 가르키게 함
				System.out.print(p.getItem()+"\t ");
		System.out.println();
	}

}
