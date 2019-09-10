package Practice04;


class Song{
	private String title;
	private String artist;
	private int year;
	String country;
	
	public Song() {	}; // 기본 생성자
	
	public Song(String title,String artist, int year, String country) { // 매개변수로 모든 필드를 초기화하는 생성자
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
		}
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	
}
public class Practice04_03 {

	public static void main(String[] args) {
		Song s=new Song("Dancing Queen","ABBA",1978,"스웨덴"); // 객체 생성
		s.show();

	}

}
