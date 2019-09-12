package Subject02;
import java.util.NoSuchElementException;
// ����Ʈ�� �ܼ����Ḯ��Ʈ�� ������ SList Ŭ����
public class SList<E> {
    protected Node head; // ���� ����Ʈ�� ù ��带 ����Ŵ
	private int size;
	
	public SList() { // ���� ����Ʈ ������
		head=null; // ù ��带 ����Ű�� head�� null�� �ʱ�ȭ
		size=0; // ���Ḯ��Ʈ�� ��� ���� �����ϴ� size�� 0���� �ʱ�ȭ
	}
	// Ž��, ����, ���� ������ ���� �޼ҵ� ����
	
	public int search(E target) { // target�� �˻�
		Node p=head; // �������� p�� ���Ḯ��Ʈ�� ù ��带 ����
		for(int k=0;k<size;k++) {
			if(target==p.getItem())
				return k; // Ÿ���� k��° �ε����� ������ ����
			p=p.getNext();
		}
		return -1; // Ž���� ������ ��� -1 ����
	}
	
	public void insertFront(E newItem,int aux) { // ���Ḯ��Ʈ �� �տ� �� ��� ����
		head=new Node(newItem,aux,head);
		size++;
	}
	
	public void insertAfter(E newItem,int aux,Node p) { // ��� p�ٷ� ������ �� ��� ����
		p.setNext(new Node(newItem,aux,p.getNext()));
		size++;
	}
	
	public void deleteFront() { // ����Ʈ�� ù ��� ����
		if(size==0) throw new NoSuchElementException();
		head=head.getNext();
		size--;
	}
	
	public void deleteAfter(Node p) { // p�� ����Ű�� ����� ���� ��带 ����
		if(p==null) throw new NoSuchElementException();
		Node t=p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}
	
	  public static SList<Integer> merge(SList<Integer> f,SList<Integer> g) {
          Node<Integer> p=f.head;
          Node<Integer> q=g.head;
          SList<Integer> s=new SList<Integer>();
          do {
             if(p.getAux()>q.getAux()) {
                s.insertFront(p.getItem(), p.getAux());
                p=p.getNext();
             }else if(p.getAux()<q.getAux()) {
                s.insertFront(q.getItem(), q.getAux());
                q=q.getNext();
             }else {
                s.insertFront(p.getItem()+q.getItem(), p.getAux());
                p=p.getNext();
                q=q.getNext();
             }
          }while(p!=null||q!=null);
          
          return s;
          
       }
	  
	  public static void print(Node<Integer> r) {
	         if(r.getNext() == null) {
	            System.out.print(r.getItem() +"x^"+ r.getAux()+" + ");
	         }
	         else {
	            print(r.getNext());
	            if(r.getAux() == 0) {
	               System.out.print(r.getItem());
	            }
	            else {
	               System.out.print(r.getItem() +"x^"+ r.getAux()+" + ");
	            }
	         }
	    }


}
	

	

