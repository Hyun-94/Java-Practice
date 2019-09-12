package Subject02;
import java.util.NoSuchElementException;
// 리스트를 단순연결리스트로 구현한 SList 클래스
public class SList<E> {
    protected Node head; // 연결 리스트의 첫 노드를 가르킴
	private int size;
	
	public SList() { // 연결 리스트 생성자
		head=null; // 첫 노드를 가르키는 head를 null로 초기화
		size=0; // 연결리스트의 노드 수를 저장하는 size를 0으로 초기화
	}
	// 탐색, 삽입, 삭제 연산을 위한 메소드 선언
	
	public int search(E target) { // target을 검색
		Node p=head; // 지역변수 p가 연결리스트의 첫 노드를 참조
		for(int k=0;k<size;k++) {
			if(target==p.getItem())
				return k; // 타겟이 k번째 인덱스에 있음을 리턴
			p=p.getNext();
		}
		return -1; // 탐색을 실패한 경우 -1 리턴
	}
	
	public void insertFront(E newItem,int aux) { // 연결리스트 맨 앞에 새 노드 삽입
		head=new Node(newItem,aux,head);
		size++;
	}
	
	public void insertAfter(E newItem,int aux,Node p) { // 노드 p바로 다음에 새 노드 삽입
		p.setNext(new Node(newItem,aux,p.getNext()));
		size++;
	}
	
	public void deleteFront() { // 리스트의 첫 노드 삭제
		if(size==0) throw new NoSuchElementException();
		head=head.getNext();
		size--;
	}
	
	public void deleteAfter(Node p) { // p가 가르키는 노드의 다음 노드를 삭제
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
	

	

