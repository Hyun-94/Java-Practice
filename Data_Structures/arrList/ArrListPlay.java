package Subject01;


public class ArrListPlay {

	public static void main(String[] args) {
		ArrList<String> fruit=new ArrList<String>();
		fruit.insert("apple");
		fruit.print();
		fruit.insert("orange");
		fruit.print();
		fruit.insert("cheery");
		fruit.print();
		fruit.insert("pear");
		fruit.print();
		fruit.insert("grape",1);
		fruit.print();
		fruit.insert("lemon",4);
		fruit.print();
		fruit.insert("kiwi");
		fruit.print();
		fruit.delete(4);
		fruit.print();
		fruit.delete(0);
		fruit.print();
		fruit.delete(0);
		fruit.print();
		fruit.delete(3);
		fruit.print();
		fruit.delete(0);
		fruit.print();
		
		System.out.println("1번째 항목은"+fruit.peek(1)+"이다.");
		System.out.println();

	}

}
