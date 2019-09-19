package Subject04;

public class Node<E> {
	private E item; // �׸��� ������ item
	private Node<E> next; // Node ���۷����� �����ϴ� next
	
	public Node(E newItem,Node<E> node) { // ������
		item=newItem;
		next=node;
	}
	
	public E getItem() {return item;}
	public void setItem(E newItem) {item=newItem;}
	public Node<E> getNext(){return next;}
	public void setNect(Node<E> newNext) {next=newNext;}

}
