package Subject02;

public class SListMain {

	public static void main(String[] args) {
		SList<Integer> a1=new SList<Integer>();
		
		a1.insertFront(-9, 0);
		a1.insertFront(-2, 2);
		a1.insertFront(7, 3);
		a1.insertFront(3, 6); // ����
		
		SList<Integer> a2=new SList<Integer>();
		
		a2.insertFront(1, 0);
		a2.insertFront(6, 1);
		a2.insertFront(6, 2);
		a2.insertFront(-4, 4);
		a2.insertFront(-2, 6); // ����
		
		 SList<Integer> result=new SList<Integer>();
         result = result.merge(a1,a2);
         Node<Integer> r = result.head;
         System.out.print("�� ���׽��� ��: h(x)= ");
         result.print(r);

				
		
		
		
	}



	
}
