package Subject02;

// �ܼ����Ḯ��Ʈ�� ��带 ������ NodeŬ����
public class Node<E> {
	private E item; // �׸��� ������ ���� item
	private int aux; // ������ ������ ���� aux
	private Node<E> next; // Node ���۷����� �����ϴ� next
	
	public Node(E newItem,int aux,Node<E> node) { // ������
		this.item=newItem;
		this.aux=aux;
		this.next=node;
	}
	//get�� set �޼ҵ�
	public E getItem() {return item;}
	public void setItem(E newItem) {item=newItem;}
	public int getAux() {return aux;}
	public void setAux(int aux) {aux=aux;}
	public Node<E> getNext(){return next;}
	public void setNext(Node<E> newNext) {next=newNext;}
	
}

