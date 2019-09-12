package Subject02;

// 단순연결리스트의 노드를 정의한 Node클래스
public class Node<E> {
	private E item; // 항목을 저장할 변수 item
	private int aux; // 차수를 저장할 변수 aux
	private Node<E> next; // Node 레퍼런스를 저장하는 next
	
	public Node(E newItem,int aux,Node<E> node) { // 생성자
		this.item=newItem;
		this.aux=aux;
		this.next=node;
	}
	//get과 set 메소드
	public E getItem() {return item;}
	public void setItem(E newItem) {item=newItem;}
	public int getAux() {return aux;}
	public void setAux(int aux) {aux=aux;}
	public Node<E> getNext(){return next;}
	public void setNext(Node<E> newNext) {next=newNext;}
	
}

