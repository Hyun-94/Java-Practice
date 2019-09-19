package Subject04;

public class Node<E> {
	private E item; // 항목을 저장할 item
	private Node<E> next; // Node 레퍼런스를 저장하는 next
	
	public Node(E newItem,Node<E> node) { // 생성자
		item=newItem;
		next=node;
	}
	
	public E getItem() {return item;}
	public void setItem(E newItem) {item=newItem;}
	public Node<E> getNext(){return next;}
	public void setNect(Node<E> newNext) {next=newNext;}

}
