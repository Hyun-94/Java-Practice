package Practice04;


class Song{
	private String title;
	private String artist;
	private int year;
	String country;
	
	public Song() {	}; // �⺻ ������
	
	public Song(String title,String artist, int year, String country) { // �Ű������� ��� �ʵ带 �ʱ�ȭ�ϴ� ������
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
		}
	
	public void show() {
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
	
}
public class Practice04_03 {

	public static void main(String[] args) {
		Song s=new Song("Dancing Queen","ABBA",1978,"������"); // ��ü ����
		s.show();

	}

}
