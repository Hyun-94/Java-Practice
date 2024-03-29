package Practice04;

class Rectangle{
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	public void show() {
	      System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	public int square() {
	      return (width*height);
	}
	
	public boolean contains(Rectangle r) {
	      if(x < r.x && y < r.y) // 1.안에 있으려면 좌표는 커야한다
	         if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height)) // 2. 좌표+가로의 길이,좌표+세로의 길으는 작아야 한다.
	            return true;
	      return false;
	   }
	}

public class Practice04_04 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,2,8,7);
		Rectangle s=new Rectangle(5,5,6,6);
		Rectangle t=new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 "+ s.square());
		if(t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if(t.contains(s))
			System.out.println("t는 s를 포함합니다.");

	}

}
